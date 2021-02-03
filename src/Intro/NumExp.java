package Intro;

public class NumExp extends Exp {
    public int num;

    public NumExp(int n) {
        num = n;
    }

    @Override
    public int maxargs() {
        return 0;
    }
}
