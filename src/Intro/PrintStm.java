package Intro;

public class PrintStm extends Stm {
    public ExpList expList;

    public PrintStm(ExpList el) {
        expList = el;
    }

    @Override
    public int maxargs() {
        return Integer.max(expList.length(), expList.maxargs());
    }

    @Override
    public Table interpStm(Table t) throws Exception {
        ExpList curr = expList;
        PairTableInt tCurr = new PairTableInt(0, t);
        boolean first = true;

        while (curr != null) {
            tCurr = curr.exp.interpExp(tCurr.table);

            if (first)
                System.out.print(tCurr.retVal);
            else
                System.out.print(" " + tCurr.retVal);

            curr = curr.next();
            first = false;
        }

        System.out.println();
        return tCurr.table;
    }
}
