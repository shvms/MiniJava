package Intro;

public class LastExpList extends ExpList {
    public Exp exp;

    public LastExpList(Exp e) {
        exp = e;
    }

    @Override
    public int length() {
        return 1;
    }
}
