package Intro;

public class IdExp extends Exp {
    public String id;

    public IdExp(String i) {
        id = i;
    }

    @Override
    public int maxargs() {
        return 0;
    }
}
