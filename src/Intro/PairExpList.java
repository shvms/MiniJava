package Intro;

public class PairExpList extends ExpList {
    public ExpList tail;

    public PairExpList(Exp e, ExpList t) {
        exp = e;
        tail = t;
    }

    @Override
    public int maxargs() {
        return Integer.max(exp.maxargs(), tail.maxargs());
    }

    @Override
    public int length() {
        return 1 + tail.length();
    }

    @Override
    public ExpList next() {
        return tail;
    }
}
