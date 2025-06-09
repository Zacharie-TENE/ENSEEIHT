/*

PROJET SMT
Auteur : TENE FOGANG Zacharie Igor : ztg4419
 
*/



/* 
Question 1 

Soit N le nombre de constantes données en entrée
chacune pouvant être utilisée exactement une fois (N étapes pour pousser chaque constante sur la pile)
Une opération binaire nécessitant deux constantes,le nombre maximal d'opérations pouvant être effectuées est N-1
Le nombre maximal d'étapes de calcul dans l'algorithme est  donc 2N−1 (N+N-1)
Ce 2N-1 est donc le seuil de complétude du problème, 
car c'est le nombre maximal d'étapes nécessaires pour 
explorer toutes les possibilités valides.
*/


package fr.n7.smt;

import java.math.BigInteger;
import java.util.*;
import com.microsoft.z3.*;

/**
 * Transition system for the "Countdown" game a.k.a. "des chiffres
 * et des lettres" in French.
 *
 * @author Christophe Garion <christophe.garion@isae-supaero.fr>
 * @author Rémi Delmas <remi.delmas@onera.fr>
 *
 */
public class ChiffresTransitionSystem extends TransitionSystem {

    private Context       context;
    private ChiffresCache cache;
    private int           bvBits;
    private int[]         nums;
    private int           target;
    private int           maxNofSteps;
    private boolean       noOverflows;

    // minmum and maximum values for bitvectors
    private BigInteger    maxBvRange;
    private BigInteger    minBvRange;

    private BitVecNum toBvNum(int num) {
        if (noOverflows) {
            BigInteger bigNum = new BigInteger(String.valueOf(num));

            if (bigNum.compareTo(minBvRange) >= 0 && bigNum.compareTo(maxBvRange) <= 0)
                return context.mkBV(num, bvBits);
            else
                throw new Error("the numeral " + String.valueOf(num) +
                                " exceed signed bitvectors of size " +
                                String.valueOf(bvBits));
        } else {
            return context.mkBV(num, bvBits);
        }
    }

    /**
     * Creates a new Chiffres transition system
     *
     * @param nums an array with the starting integers
     * @param target the target integer
     * @param bvBits the number of bits in bitvectors
     * @param noOverflows a boolean that is true if you do not want
     *        overflows with bitvectors
     */
    public ChiffresTransitionSystem(int[] nums, int target, int bvBits, boolean noOverflows) {
        this.context     = Z3Utils.getZ3Context();
        this.cache       = new ChiffresCache(bvBits);
        this.nums        = nums;
        this.target      = target;
        this.bvBits      = bvBits;
        this.maxBvRange  = new BigInteger("2").pow(bvBits-1).subtract(new BigInteger("1"));
        this.minBvRange  = new BigInteger("2").pow(bvBits-1).negate();

        // d'après ma reponse à la question 1
        this.maxNofSteps =  2 * nums.length - 1;

        this.noOverflows = noOverflows;
    }

    /**
     * Gets the maximum number of steps of the transition system.
     *
     */
    public int getMaxNofSteps() {
        return this.maxNofSteps;
    }

    @Override
    public BoolExpr initialStateFormula() {
           
        // L'état initial du pointeur de pile
        BoolExpr idxAtZero = context.mkEq(cache.idxStateVar(0), context.mkInt(0));
        
        // l'état initial pour la pile (tous les éléments à 0)
        ArrayExpr<IntSort, BitVecSort> stack = cache.stackStateVar(0);
        BitVecExpr zeroValue = toBvNum(0);
        
        //la pile avec des zéros (la pile est vide mais remplie de zéros)
        BoolExpr stackInitialized = context.mkEq(stack, context.mkConstArray(context.getIntSort(), zeroValue));
        
        return context.mkAnd(idxAtZero, stackInitialized);
    }

    @Override
    public BoolExpr finalStateFormula(int step) {
          
        BoolExpr result;
        
        // Condition 1: la taille de la pile est 1
        IntExpr idx = cache.idxStateVar(step);
        BoolExpr stackSizeIsOne = context.mkEq(idx, context.mkInt(1));

         // l'adresse du sommet de la pile qui est (idx-1)
        IntExpr addressTop = (IntExpr) context.mkSub(idx, context.mkInt(1));
        
        //la valeur en haut de la pile (indice 0)
        BitVecExpr topValue = (BitVecExpr) context.mkSelect(cache.stackStateVar(step), addressTop);
        
        // la valeur bitvector en entier signé
        // IntExpr topValueAsInt = context.mkBV2Int(topValue, true);

        BitVecExpr targetAsBv = toBvNum(target);
        
        // l'égalité avec la valeur cible
        BoolExpr topValueIsTarget = context.mkEq(topValue, targetAsBv);
        
        result= context.mkAnd(stackSizeIsOne, topValueIsTarget);

        return result;
    }

    /**
     * A boolean formula that should be true iff states at step and
     * step + 1 are linked by a "push(num)" action.
     */
    private BoolExpr pushNumFormula(int step, int num) {
           BoolExpr result;

        // On récupère les piles et leurs index
        ArrayExpr<IntSort, BitVecSort> stack = cache.stackStateVar(step);
        IntExpr idx = cache.idxStateVar(step);

        ArrayExpr<IntSort, BitVecSort> nextStack = cache.stackStateVar(step + 1);
        IntExpr nextIdx = cache.idxStateVar(step + 1);
        
        result = context.mkEq(nextIdx, context.mkAdd(idx, context.mkInt(1)));
       
        BitVecExpr numAsBv = toBvNum(num);
        
        ArrayExpr<IntSort, BitVecSort> stackUpdated = context.mkStore(stack, idx, numAsBv);
        
        BoolExpr stackOkay = context.mkEq(nextStack, stackUpdated);

        // combiner les conditions
        result = context.mkAnd(result, stackOkay);
        
        // ce nombre n'a pas été poussé avant
        for (int j = 0; j < step; j++) {
            result = context.mkAnd(result, context.mkNot(cache.pushNumVar(j, num)));
        }
        
        //le tout à la variable de décision push_num
        result = context.mkImplies(cache.pushNumVar(step, num), result);
        
        return result;
    }


    private interface ActionVar {
        /**
         * Returns the decision variable for the action at step.
         *
         */
        BoolExpr get(int step);
    }

    private interface ActionResult {
        /**
         * Returns the expression of the action result at step using
         * e1 and e2, the two top values of the stack.
         *
         */
        BitVecExpr get(int step, BitVecExpr e1, BitVecExpr e2);
    }

    private interface ActionPrecondition {
        /**
         * Returns the expression of the action precondition at step
         * using e1 and e2, the two top values of the stack.
         *
         */
        BoolExpr get(int step, BitVecExpr e1, BitVecExpr e2);
    }


    private BoolExpr actionFormula(int step, ActionVar actVar, ActionPrecondition precond, ActionResult opRes) {
          ArrayExpr<IntSort, BitVecSort> stack = cache.stackStateVar(step);
        IntExpr idx = cache.idxStateVar(step);
        
        ArrayExpr<IntSort, BitVecSort> nextStack = cache.stackStateVar(step + 1);
        IntExpr nextIdx = cache.idxStateVar(step + 1);
        
        //il faut au moins 2 éléments dans la pile
        BoolExpr validation = context.mkGe(idx, context.mkInt(2));
        
        // Sommet = idx - 1, second = idx - 2
        IntExpr topIndex = (IntExpr) context.mkSub(idx, context.mkInt(1));
        IntExpr secondIndex = (IntExpr) context.mkSub(idx, context.mkInt(2));
        
        // les valeurs aux indices 
        BitVecExpr element1 = (BitVecExpr) context.mkSelect(stack, secondIndex);
        BitVecExpr element2 = (BitVecExpr) context.mkSelect(stack, topIndex);    
        
        BoolExpr operationPrecond = precond.get(step, element1, element2);
        
        // le résultat de l'opération
        BitVecExpr result = opRes.get(step, element1, element2);
        
        // la pile après l'opération a un élément de moins
        BoolExpr idxOKay = context.mkEq(nextIdx, topIndex);
        
        // La pile suivante est obtenue 
        ArrayExpr<IntSort, BitVecSort> newStack = context.mkStore(stack, secondIndex, result);
        
        //on se rassure que la pile suivante est correcte
        BoolExpr stackOkay = context.mkEq(nextStack, newStack);
        
        
        return context.mkImplies(
            actVar.get(step),           // la variable de décision pour cette action
            context.mkAnd(
                validation,             // il y a au moins 2 éléments dans la pile
                operationPrecond,       // precondition
                idxOKay,                // l'index de pile diminue de 1
                stackOkay               // transition de la pile correcte
            )
        );
    }

    /**
     * A boolean formula that should be true iff states at step and
     * step + 1 are linked by a "add" action.
     */
    private BoolExpr addFormula(int step) {
        ActionVar actVar = (s) -> {return cache.addVar(s);};
     
        ActionPrecondition precond = (s, element1, element2) -> {
            
            if (noOverflows) {
                return context.mkAnd(
                    context.mkBVAddNoOverflow(element1, element2, true),  
                    context.mkBVAddNoOverflow(element1, element2, false) 
                );
            } else {
                return context.mkTrue();
            }
            
        };
        
         ActionResult opRes = (s, element1, element2) -> {return context.mkBVAdd(element1, element2);};
    
        return actionFormula(step, actVar, precond, opRes);
    }

    /**
     * A boolean formula that should be true iff states at step and
     * step + 1 are linked by a "sub" action.
     */
    private BoolExpr subFormula(int step) {
        
        ActionVar actVar = (s) -> {return cache.subVar(s);};
        
        ActionPrecondition precond = (s, element1, element2) -> {
            if (noOverflows) {
                return context.mkAnd(
                    context.mkBVSubNoOverflow(element1, element2),
                    context.mkBVSubNoUnderflow(element1, element2, true));
            } else {
                return context.mkTrue();
            }
        };
        

        ActionResult opRes = (s, element1, element2) -> {return context.mkBVSub(element1, element2);};
        
        return actionFormula(step, actVar, precond, opRes);
    }

    /**
     * A boolean formula that should be true iff states at step and
     * step + 1 are linked by a "mul" action.
     */
    private BoolExpr mulFormula(int step) {
           
        ActionVar actVar = (s) -> {return cache.mulVar(s);};
        
        ActionPrecondition precond = (s, element1, element2) -> {
            if (noOverflows) {
                return context.mkAnd(
                    context.mkBVMulNoOverflow(element1, element2, true), 
                    context.mkBVMulNoOverflow(element1, element2, false));
            } else {
                return context.mkTrue();
            }
        };
        
        ActionResult opRes = (s, element1, element2) -> {return context.mkBVMul(element1, element2);};
        
        return actionFormula(step, actVar, precond, opRes);
    }

    /**
     * A boolean formula that should be true iff states at step and
     * step + 1 are linked by a "div" action.
     */
    private BoolExpr divFormula(int step) {
        ActionVar actVar =(s) -> {return  cache.divVar(s);};

        ActionPrecondition precond = (s, element1, element2) -> { 
            BoolExpr notZero = context.mkNot(context.mkEq(element2, toBvNum(0)));
            if (noOverflows) {
                return context.mkAnd(notZero, context.mkBVSDivNoOverflow(element1, element2));
            } else {
                return notZero;
            }
        };
        
        ActionResult opRes = (s, element1, element2) -> {return context.mkBVSDiv(element1, element2);};
        
        return actionFormula(step, actVar, precond, opRes);
    }

    @Override
    public BoolExpr transitionFormula(int step) {
      
        ArrayList<BoolExpr> transitionFormulas = new ArrayList<>();
        ArrayList<BoolExpr> decisionVars = new ArrayList<>();

        // les formules pour chaque action push_num
        for (int num : nums) {
            transitionFormulas.add(pushNumFormula(step, num));
        }
        
        //les formules pour les opérations arithmétiques
        transitionFormulas.add(addFormula(step));
        transitionFormulas.add(subFormula(step));
        transitionFormulas.add(mulFormula(step));
        transitionFormulas.add(divFormula(step));
        
        
        //les variables de décision pour push_num
        for (int num : nums) {
            decisionVars.add(cache.pushNumVar(step, num));
        }
        
        //les variables de décision pour les opérations arithmétiques
        decisionVars.add(cache.addVar(step));
        decisionVars.add(cache.subVar(step));
        decisionVars.add(cache.mulVar(step));
        decisionVars.add(cache.divVar(step));
        
        //une action est effectuée à chaque étape
        BoolExpr exactlyOneAction = Z3Utils.exactlyOne(decisionVars.toArray(new BoolExpr[0]));
        
       
        return context.mkAnd(
            context.mkAnd(transitionFormulas.toArray(new BoolExpr[0])),
            exactlyOneAction
        );
    }

    @Override
    public void printParams() {
        System.out.println("\nChiffres transition system parameters:");
        System.out.println("- nums       : " + Arrays.toString(nums));
        System.out.println("- target     : " + String.valueOf(target));
        System.out.println("- bvBits     : " + String.valueOf(bvBits));
        System.out.println("- noOverflows: " + String.valueOf(noOverflows));
    }

    /**
     * Prints the stack at step.
     */
    private void printStackAtStep(Model m, int step) {
        int idxState = ((IntNum) m.eval(cache.idxStateVar(step), true)).getInt();

        for (int idx = 0; idx <= maxNofSteps; idx++) {
            BitVecExpr resbv =
                (BitVecExpr) context.mkSelect(cache.stackStateVar(step),
                                              context.mkInt(idx));
            IntExpr resi = context.mkBV2Int(resbv, true);

            if (idx == 0) {
                System.out.print("|");
            }

            if (idx < idxState) {
                System.out.print("|\033[7m");
            } else {
                System.out.print("|");
            }

            System.out.printf("%4d", ((IntNum) m.eval(resi, true)).getInt());

            if (idx < idxState) {
                System.out.print("\033[m");
            }
        }
    }

    @Override
    public void printModel(Model m, int steps) {
        System.out.printf("  init %3s ~> ", " ");
        printStackAtStep(m, 0);
        System.out.println();

        for (int step = 0; step < steps; step++) {
            for (int num : nums) {
                if (m.eval(cache.pushNumVar(step, num), true).isTrue()) {
                    System.out.printf("  push %3d ~> ", num);
                }
            }

            if (m.eval(cache.mulVar(step), true).isTrue()) {
                System.out.printf("  mul %4s ~> ", " ");
            }

            if (m.eval(cache.divVar(step), true).isTrue()) {
                System.out.printf("  div %4s ~> ", " ");
            }

            if (m.eval(cache.addVar(step), true).isTrue()) {
                System.out.printf("  add %4s ~> ", " ");
            }

            if (m.eval(cache.subVar(step), true).isTrue()) {
                System.out.printf("  sub %4s ~> ", " ");
            }

            printStackAtStep(m, step + 1);

            System.out.println();
        }
    }







     /*
     QUESTION 9 (a)
     Renvoie le critère d'optimisation pour trouver la meilleure solution approchée,
     c'est-à-dire la valeur absolue de la différence entre le résultat obtenu
     et le résultat attendu.
     */
    @Override
    public BitVecExpr finalStateApproxCriterion(int step) {
        // l'index de pile
        IntExpr idx = cache.idxStateVar(step);
        
        // l'adresse du sommet de la pile (idx-1)
        IntExpr addressTop = (IntExpr) context.mkSub(idx, context.mkInt(1));
        
        // On récupère la valeur en haut de la pile
        BitVecExpr topValue = (BitVecExpr) context.mkSelect(cache.stackStateVar(step), addressTop);
        
        // la valeur cible en bitvector
        BitVecExpr targetAsBV = toBvNum(target);
        
        //la différence (peut être positive ou négative)
        BitVecExpr diff = context.mkBVSub(topValue, targetAsBV);
        
        // la valeur absolue de la différence
        BoolExpr isNegative = context.mkBVSLT(diff, toBvNum(0)); // diff < 0
        BitVecExpr negDiff = context.mkBVNeg(diff); // -diff
        
        // Si la différence est négative, on prend -diff, sinon on prend diff
        BitVecExpr absDiff = (BitVecExpr) context.mkITE(isNegative, negDiff, diff);
        
        return absDiff;
    }
}
