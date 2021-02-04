package Intro;

public class OpExp extends Exp {
    public Exp leftExp, rightExp;
    public int oper;
    final public static int Plus = 1, Minus = 2, Times = 3, Div = 4;

    public OpExp(Exp le, int o, Exp re) {
        leftExp = le;
        oper = o;
        rightExp = re;
    }

    @Override
    public int maxargs() {
        return Integer.max(leftExp.maxargs(), rightExp.maxargs());
    }

    @Override
    public PairTableInt interpExp(Table t) throws Exception {
        PairTableInt pair = leftExp.interpExp(t);
        int r1 = pair.retVal;

        pair = rightExp.interpExp(pair.table);
        int r2 = pair.retVal;

        int retVal;
        switch (oper) {
            case 1:
                retVal = r1 + r2;
                break;
            case 2:
                retVal = r1 - r2;
                break;
            case 3:
                retVal = r1 * r2;
                break;
            case 4:
                if (r2 == 0)
                    throw new Exception("Arithmetic Exception: Cannot divide by 0.");
                retVal = r1 / r2;
                break;
            default:
                throw new Exception("Syntax Error: Invalid binary operator.");
        }

        return new PairTableInt(retVal, pair.table);
    }
}
