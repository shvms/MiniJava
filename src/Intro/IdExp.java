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

    @Override
    public PairTableInt interpExp(Table t) throws IdentifierNotDefinedException {
        return new PairTableInt(t.lookup(id), t);
    }
}
