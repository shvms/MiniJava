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
}
