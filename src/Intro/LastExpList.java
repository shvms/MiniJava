package Intro;

public class LastExpList extends ExpList {
    public LastExpList(Exp e) {
        exp = e;
    }

    @Override
    public int maxargs() {
        return exp.maxargs();
    }

    @Override
    public int length() {
        return 1;
    }

    @Override
    public ExpList next() {
        return null;
    }
}
