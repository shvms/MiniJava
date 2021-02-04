package Intro;

public class AssignStm extends Stm {
    public String id;
    public Exp exp;

    public AssignStm(String i, Exp e) {
        id = i;
        exp = e;
    }

    @Override
    public int maxargs() {
        return exp.maxargs();
    }

    @Override
    public Table interpStm(Table t) throws Exception {
        PairTableInt pair = exp.interpExp(t);
        return pair.table.update(id, pair.retVal);
    }
}
