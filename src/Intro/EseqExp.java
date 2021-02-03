package Intro;

public class EseqExp extends Exp {
    public Stm stm;
    public Exp exp;

    public EseqExp(Stm s, Exp e) {
        stm = s;
        exp = e;
    }

    @Override
    public int maxargs() {
        return Integer.max(stm.maxargs(), exp.maxargs());
    }
}
