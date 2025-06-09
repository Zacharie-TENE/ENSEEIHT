package fr.n7.smt;



import com.microsoft.z3.*;

/**
 * A transition system representing swaps of an array. The state of the
 * transition system is represented by a Z3 array containing integer
 * values.
 *
 * @author Christophe Garion
 */
public class ArraySwapsTransitionSystem extends TransitionSystem {

    private Context                       context;
    private int                           length;
    private int[]                         values;
    private ArrayExpr<IntSort, IntSort>[] arrays;
    private BoolExpr[][][]                actions;

    // as Java does not support arrays of generic types, we suppress
    // corresponding warnings
    @SuppressWarnings("unchecked")
    public ArraySwapsTransitionSystem(int length,
                                      int values[]) {
        // init attributes
        this.context = Z3Utils.getZ3Context();
        this.length  = length;
        this.values  = values;

        // init Z3 arrays
        this.arrays = new ArrayExpr[length+1];

        // TODO: init this.arrays components
        //
        for (int i = 0; i <= length; i++) {
            this.arrays[i] = context.mkArrayConst("array_step" + i, context.getIntSort(), context.getIntSort());
        }

        // init actions
        this.actions = new BoolExpr[length][this.length][this.length];

        // TODO: init this.actions components
        for (int step = 0; step < length; step++) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (i != j) {
                        this.actions[step][i][j] = context.mkBoolConst("echange_" + step + "_" + i + "_" + j);
                    }
                }
            }
        }
    }

    @Override
    public BoolExpr initialStateFormula() {
        // TODO: to complete!
        BoolExpr[] constraints = new BoolExpr[length];
            for (int i = 0; i < length; i++) {
                constraints[i] = context.mkEq(context.mkSelect(arrays[0], context.mkInt(i)), context.mkInt(values[i]));
        }
        return this.context.mkTrue();
    }

    @Override
    public BoolExpr finalStateFormula(int step) {
        // TODO: to complete!

        // if step is different from 3 return null to avoid trying
        // to solve the problem

       //   return this.context.mkTrue();

        if (step != length - 1) {
            return null; // Skip final state check for intermediate steps
        }

        BoolExpr[] constraints = new BoolExpr[length - 1];
        for (int i = 0; i < length - 1; i++) {
            constraints[i] = context.mkLe(
                context.mkSelect(arrays[step], context.mkInt(i)),
                context.mkSelect(arrays[step], context.mkInt(i + 1))
            );
        }
        return context.mkAnd(constraints);
    }

    @Override
    public BoolExpr transitionFormula(int step) {
        // TODO: to complete!

       // return this.context.mkTrue();
       BoolExpr[] constraints = new BoolExpr[length * (length - 1)];
       int index = 0;

       for (int i = 0; i < length; i++) {
           for (int j = 0; j < length; j++) {
               if (i != j) {
                   // If swap(i, j) is true, swap elements i and j
                   ArrayExpr<IntSort, IntSort> currentArray = arrays[step];
                   ArrayExpr<IntSort, IntSort> nextArray = arrays[step + 1];

                   BoolExpr swapCondition = actions[step][i][j];
                   BoolExpr swapEffect = context.mkAnd(
                       context.mkEq(context.mkSelect(nextArray, context.mkInt(i)), context.mkSelect(currentArray, context.mkInt(j))),
                       context.mkEq(context.mkSelect(nextArray, context.mkInt(j)), context.mkSelect(currentArray, context.mkInt(i)))
                   );

                   // Other elements remain unchanged
                   BoolExpr[] unchanged = new BoolExpr[length - 2];
                   int kIndex = 0;
                   for (int k = 0; k < length; k++) {
                       if (k != i && k != j) {
                           unchanged[kIndex++] = context.mkEq(
                               context.mkSelect(nextArray, context.mkInt(k)),
                               context.mkSelect(currentArray, context.mkInt(k))
                           );
                       }
                   }

                   constraints[index++] = context.mkImplies(swapCondition, context.mkAnd(swapEffect, context.mkAnd(unchanged)));
               }
           }
       }

       // Ensure exactly one swap action is taken at each step
       BoolExpr[] actionConstraints = new BoolExpr[length * (length - 1)];
       index = 0;
       for (int i = 0; i < length; i++) {
           for (int j = 0; j < length; j++) {
               if (i != j) {
                   actionConstraints[index++] = actions[step][i][j];
               }
           }
       }
       BoolExpr oneAction = context.mkOr(actionConstraints);

       return context.mkAnd(context.mkOr(constraints), oneAction);
    }

    @Override
    public void printParams() {
        System.out.println("\nArrays swaps transition system parameters:");

        StringBuilder sb = new StringBuilder("");

        sb.append("[ ");

        for (int i = 0; i < this.length; i++) {
            sb.append(this.values[i] + (i != length - 1 ? ", " : ""));
        }

        sb.append(" ]");

        System.out.println("- starting array: " + sb);
    }

    private String arrayToString(ArrayExpr<IntSort, IntSort> array, Model m, int length) {
        StringBuilder sb = new StringBuilder("");

        sb.append("[ ");

        for (int i = 0; i < length; i++) {
            sb.append(m.eval(this.context.mkSelect(array,
                                                   this.context.mkInt(i)),
                             true) +
                      (i != length - 1 ? ", " : ""));
        }

        sb.append(" ]");

        return sb.toString();
    }

    private String decisionToString(Model m, int step) {
        String decision = null;

        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length; j++) {
                if (m.getConstInterp(actions[step][i][j]).isTrue()) {
                    if (decision == null) {
                        decision = actions[step][i][j].toString();
                    } else {
                        System.err.println("*** Problem: at least two decisions for the same step! ***");
                        System.err.println("   " + decision.toString() + " and " +
                                           actions[step][i][j].toString());
                        System.exit(1);
                    }
                }
            }
        }

        return decision;
    }

    @Override
    public void printModel(Model m, int steps) {
        for (int s = 0; s < 4; s++) {
            System.out.println("  " + s + ". array: " +
                               this.arrayToString(this.arrays[s], m, this.length));
            if (s != 3) {
                System.out.println("     decision: " + this.decisionToString(m, s));
            }
        }
    }
}
