package Intro;

public class PairExpList extends ExpList {
    public Exp head;
    public ExpList tail;

    public PairExpList(Exp h, ExpList t) {
        head = h;
        tail = t;
    }

    @Override
    public int length() {
        return 1 + tail.length();
    }
}
