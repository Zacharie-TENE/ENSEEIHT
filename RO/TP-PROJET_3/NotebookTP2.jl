DISPLAY_TREE = true
if DISPLAY_TREE
    # Les 2 lignes suivantes à décommenter sur les machines persos
    # import Pkg; 
    # Pkg.add("GraphRecipes"); Pkg.add("Plots"); 
    using GraphRecipes, Plots #only used to visualize the search tree at the end of the branch-and-bound
end

function readKnaptxtInstance(filename)
    price=Int64[]
    weight=Int64[]
    KnapCap=Int64[]
    open(filename) do f
        for i in 1:3
            tok = split(readline(f))
            if(tok[1] == "ListPrices=")
                for i in 2:(length(tok)-1)
                    push!(price,parse(Int64, tok[i]))
                end
            elseif(tok[1] == "ListWeights=")
                for i in 2:(length(tok)-1)
                    push!(weight,parse(Int64, tok[i]))
                end
            elseif(tok[1] == "Capacity=")
                push!(KnapCap, parse(Int64, tok[2]))
            else
            end
        end
    end
    capacity=KnapCap[1]
    return price, weight, capacity
end

function testSondability_LP(model2, x, BestProfit, Bestsol)
    TA, TO, TR = false, false, false
    if(termination_status(model2) == MOI.INFEASIBLE)#Test de faisabilite
        TA=true
    elseif(objective_value(model2) <= BestProfit) #Test d'optimalite
        TO=true
    elseif( prod(abs.([round.(v, digits=0) for v in value.(x)]-value.(x)) .<= fill(10^-5, size(x)))
        ) #Test de resolution
        TR=true
        #if (value(benef) >= BestProfit)
        if (objective_value(model2) >= BestProfit)
            Bestsol = value.(x)
            #BestProfit=value(benef)
            BestProfit=objective_value(model2)
        end
    else
        end
    TA, TO, TR, Bestsol, BestProfit
end

function separateNodeThenchooseNext_lexicographic_depthfirst!(listobjs, listvals, n)
    # this node is non-sondable. Apply the branching criterion to separate it into two subnodes
    # and choose the child-node at the left

    # lexicographic branching criterion: branch on the 1st object not yet fixed
    i, obj = 1, 0
    while((i <= n) && (obj==0))
        if(!(i in listobjs))
            obj=i
        end
        i+=1
    end


    # depthfirst exploration strategy: the node selected will be the most left of the child-nodes just created
    push!(listobjs,obj) #save the identity of the object selected for branching
    push!(listvals,1.0) #save the node selected, identified by the value assigned to the variable/object chosen
end


function exploreNextNode_depthfirst!(listobjs, listvals, listnodes)
    #this node is sondable, go back to parent node then right child if possible

    stop=false
    #check if we are not at the root node
    if (length(listobjs)>= 1)
        #go back to parent node
        obj=pop!(listobjs)
        theval=pop!(listvals)
        tmp=pop!(listnodes)

        #go to right child if possible, otherwise go back to parent
        while( (theval==0.0) && (length(listobjs)>= 1))
            obj=pop!(listobjs)
            theval=pop!(listvals)
            tmp=pop!(listnodes)
        end
        if theval==1.0
            push!(listobjs,obj)
            push!(listvals,0.0)
        else
            stop=true
        end
    else
        #the root node was sondable
        stop=true
    end
    return stop
end

# Les 3 lignes suivantes à décommenter sur les machines persos
# import Pkg; 
# Pkg.add("Clp");
# Pkg.add("JuMP");
using JuMP, Clp #to comment for the lab class

function updateModele_LP!(model2, x, listobjs, listvals)
    for i in 1:length(listobjs)
        set_lower_bound(x[listobjs[i]],listvals[i])
        set_upper_bound(x[listobjs[i]],listvals[i])
    end
end

function reset_LP!(model2, x, listobjs)
    for i in 1:length(listobjs)
        set_lower_bound(x[listobjs[i]],0.0)
        set_upper_bound(x[listobjs[i]],1.0)
    end
end

function resetAll_LP!(model2, x)
    for i in 1:length(x)
        set_lower_bound(x[i],0.0)
        set_upper_bound(x[i],1.0)
    end
end

function createModel_LP(price, weight, capacity)
# ROOT NODE

    n=length(price)

    model2 = Model(Clp.Optimizer) # set optimizer
    set_optimizer_attribute(model2, "LogLevel", 0) #don't display anything during solve
    set_optimizer_attribute(model2, "Algorithm", 4) #LP solver chosen is simplex

    # define x variables as CONTINUOUS (recall that it is not possible to define binary variables in Clp)
    @variable(model2, 0 <= x[i in 1:n] <= 1)

    # define objective function
    @objective(model2, Max, sum(price[i]*x[i] for i in 1:n))

    # define the capacity constraint
    @constraint(model2, sum(weight[i]*x[i] for i in 1:n) <=  capacity)

    return model2, x
end

function solveKnapInstance(filename)

    price, weight, capacity = readKnaptxtInstance(filename)

    model2, x = createModel_LP(price, weight, capacity)
    
    #create the structure to memorize the search tree for visualization at the end
    trParentnodes=Int64[] #will store orig node of arc in search tree
    trChildnodes=Int64[] #will store destination node of arc in search tree
    trNamenodes=[] #will store names of nodes in search tree
    
    #intermediate structure to navigate in the search tree
    listobjs=Int64[]
    listvals=Float64[]
    listnodes=Int64[]

    BestProfit::Float64=-1.0
    Bestsol=Float64[]

    current_node_number::Int64=0
    stop = false

    while(!stop)

        if DISPLAY_TREE
        #Update the graphical tree
            push!(trNamenodes,current_node_number+1) 
            if(length(trNamenodes)>=2)
                push!(trParentnodes,listnodes[end]+1) # +1 because the 1st node is "node 0"
                push!(trChildnodes, current_node_number+1) # +1 because the 1st node is "node 0"
            end
        end
        
        push!(listnodes, current_node_number)
        
        #create LP of current node
        updateModele_LP!(model2, x, listobjs, listvals)
                
        status = optimize!(model2)
        end

        TA, TO, TR, Bestsol, BestProfit = testSondability_LP(model2, x, BestProfit, Bestsol)

        is_node_sondable = TA || TO || TR

        #Reset_LP!(model2, x, listobjs)

        if(!is_node_sondable)
            separateNodeThenchooseNext_lexicographic_depthfirst!(listobjs, listvals, length(price))
        else
            stop = exploreNextNode_depthfirst!(listobjs, listvals, listnodes)
        end
        
        resetAll_LP!(model2, x)

        current_node_number = current_node_number + 1
    end


function solveNdisplayKnap(filename)

    BestProfit, Bestsol, trParentnodes, trChildnodes, trNamenodes = solveKnapInstance(filename)

end
