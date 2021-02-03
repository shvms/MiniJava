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
}
