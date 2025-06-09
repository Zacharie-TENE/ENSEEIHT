package fr.n7.smt;


import com.microsoft.z3.*;

/**
 * A Bounded Model-Checking (BMC) motor on a transition system.
 *
 * All warnings about unchecked type safety problems are suppressed.
 *
 * @author Christophe Garion
 */
@SuppressWarnings("unchecked")
public class BMC {

    private TransitionSystem system;
    private Context          context;
    private int              maxNOfSteps;
    private boolean          useApprox;
    private boolean          simulation;

    private void printParams() {
        System.out.println("\nBMC parameters:");
        System.out.println("- max nb of steps: " + this.maxNOfSteps);
        this.system.printParams();
    }

    /**
     * Create a BMC instance for a particular transition system.
     *
     * @param system the transition system
     * @param maxNOfSteps the maximum number of unrolling steps
     * @param useApprox to use approximate resolution when needed
     * @param simulation if true, then BMC is used to simulate the system
     *                   In this case, no approximate solver is used.
     */
    public BMC(TransitionSystem system,
               int maxNOfSteps,
               boolean useApprox,
               boolean simulation) {
        this.context = Z3Utils.getZ3Context();

        // initialize system
        this.system      = system;
        this.maxNOfSteps = maxNOfSteps;
        this.useApprox   = simulation ? false : useApprox;
        this.simulation  = simulation;
    }

    /**
     * This method tries to exactly solve the BMC problem. It unrolls
     * at most maxNOfSteps transitions starting from initial state.
     *
     * For each iteration of BMC:
     *
     * 1. a transition formula for the next step is added to the solver
     * 2. the final state formula for the next step is pushed into the solver
     * 3. if the problem is SAT then solution is printed
     *    else if the problem is UNSAT, the final state formula is popped
     *    and the next iteration is done
     *
     *    If the problem is UNKNOWN, the UNKNOWN status is returned.
     * 4. if the problem is UNSAT for all iterations, the UNSAT status
     *    is returned
     *
     * If the BMC solver is configured for simulation (cf. {@link BMC}),
     * then the final state formula is always True and the BMC is executed
     * exactly maxNOfSteps.
     *
     * @param timeout the timeout to use. If negative, no timeout is used
     */
    private Status solveExact(int timeout) {

      
            Solver solver = context.mkSolver();
            // Initialisation de l'état initial
            BoolExpr initialState = system.initialStateFormula();
            solver.add(initialState);


                
            if (timeout >= 0) {
                Params p = context.mkParams();
                p.add("timeout", timeout);
                solver.setParameters(p);
                System.out.println("Timeout de " + timeout + " ms");
            }
            else {
                System.out.println("Pas de timeout");
            }


    for (int step = 0; step <= maxNOfSteps; step++) {
                System.out.println("\nEtape " + step + ":");

            if (!this.simulation) {
        
                BoolExpr finalStateFormula = this.system.finalStateFormula(step);
                
            
                if (finalStateFormula != null) {
                
                    solver.push();
                    solver.add(finalStateFormula);
                    
                    Status status = solver.check();
                    System.out.println("Status à l'étape " + step + ": " + status);
                    
                    if (status == Status.SATISFIABLE) {
                        Model model = solver.getModel();
                        this.system.printModel(model, step);
                        solver.pop();
                        return Status.SATISFIABLE;
                    } 
                    else if (status == Status.UNKNOWN) {
                        solver.pop();
                        System.out.println("Status UNKNOWN");
                        return Status.UNKNOWN;
                    } 
                    else {
                        solver.pop();
                    }
                }
        } 
        else {
            
                Status status = solver.check();
                System.out.println("Simulation à l'etape" + step + ": " + status);
                
                if (status == Status.SATISFIABLE) {
                    Model model = solver.getModel();
                    this.system.printModel(model, step);
                } else if (status == Status.UNKNOWN) {
                    return Status.UNKNOWN;
                } else {
                    System.out.println("Simulation incohérente à l'étape " + step);
                    return Status.UNSATISFIABLE;
                }
        }
        
      
        if (step < this.maxNOfSteps) {
            BoolExpr transitionFormula = this.system.transitionFormula(step);
            solver.add(transitionFormula);
        }
    }
    

    if (this.simulation) {
        return Status.SATISFIABLE;
    }
    
    // si à la fin de la boucle on n'a pas trouvé de solution, on renvoie
    return Status.UNSATISFIABLE;
    
}

/*QUESTION 9 (b) */

    /**
     * This method tries to approximatively solve the BMC problem using
     * a Max-SMT solver. The main differences with the exact solver are
     * are the following:
     *
     * 1. push and pop cannot be used, therefore the complete set of
     *    formulas has to be built at each iteration
     * 2. the negation of the expected property has to be added for
     *    the next step
     * 3. the problem should therefore be SAT at each iteration. If not,
     *    return the corresponding status (UNSAT or UNKNOWN). If the
     *    problem is SAT at each step, return SAT.
     *
     * @param timeout the timeout to use. If negative, no timeout is used
     */
    private Status solveApprox(int timeout) {

    System.out.println("\nTentative de resolution approximative...");
    BoolExpr initialState = system.initialStateFormula();
    
    for (int step = 0; step <= maxNOfSteps; step++) {
        System.out.println("\nEtape approximative " + step + ":");
        
     
        Optimize optimizer = context.mkOptimize();
        if (timeout >= 0) {
            Params p = context.mkParams();
            p.add("timeout", timeout);
            optimizer.setParameters(p);
            System.out.println("Timeout de " + timeout + " ms");
        } else {
            System.out.println("Pas de timeout");
        }
        
     
        optimizer.Add(initialState);

        for (int i = 0; i < step; i++) {
            BoolExpr transitionFormula = system.transitionFormula(i);
            optimizer.Add(transitionFormula);
        }
        
        BoolExpr finalStateFormula = system.finalStateFormula(step);
        
        if (finalStateFormula != null) {
          
            BoolExpr negatedFinalState = context.mkNot(finalStateFormula);
            optimizer.Add(negatedFinalState);
            
          
            BitVecExpr criterion = (BitVecExpr) system.finalStateApproxCriterion(step);
            
           
            Optimize.Handle handle = optimizer.MkMinimize(criterion);
            Status status = optimizer.Check();
            System.out.println("Status approximatif à l'étape " + step + ": " + status);
            
            if (status == Status.SATISFIABLE) {
                Model model = optimizer.getModel();
                system.printModel(model, step);
                System.out.println("La valeur du critère d'optimisation est de: " + handle.getValue());
            } else if (status == Status.UNKNOWN) {
                System.out.println("Status UNKNOWN");
                return Status.UNKNOWN;
            } else {
                System.out.println("UNSAT à l'étape " + step);
                return Status.UNSATISFIABLE;
            }
        }
    }
    

    return Status.SATISFIABLE;


}

    /**
     * Tries to solve the BMC problem using exact resolution and
     * approximate resolution if asked.
     *
     * @param timeout the timeout to use. If negative, no timeout is used
     */
    public Status solve(int timeout) {
        this.printParams();

        Status s = this.solveExact(timeout);
       

        if (this.useApprox && s != Status.SATISFIABLE) {
            s = this.solveApprox(timeout);
        }

        return s;
    }
}
