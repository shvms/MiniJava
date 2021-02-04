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

    @Override
    public PairTableInt interpExp(Table t) throws Exception {
        Table t1 = stm.interpStm(t);

        return exp.interpExp(t1);
    }
}
