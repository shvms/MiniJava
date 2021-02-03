package Intro;

public class PrintStm extends Stm {
    public ExpList expList;

    public PrintStm(ExpList el) {
        expList = el;
    }

    @Override
    public int maxargs() {
        return expList.length();
    }
}
