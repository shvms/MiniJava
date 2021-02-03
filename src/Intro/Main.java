package Intro;

public class Main {
    public static void main(String[] args) {
        /* Program
         a := 5 + 3 ; b := ( print ( a, a - 1 ) , 10 * a ) ; print ( b )

         Outputs:
         8 7
         80
         */
        Stm program = new CompoundStm(
            new AssignStm("a", new OpExp(
                new NumExp(5),
                OpExp.Plus,
                new NumExp(3)
            )),
            new CompoundStm(
                new AssignStm("b",
                    new EseqExp(
                        new PrintStm(new PairExpList(
                            new IdExp("a"),
                            new LastExpList(
                                new OpExp(
                                    new IdExp("a"),
                                    OpExp.Minus,
                                    new NumExp(1)
                                )
                            )
                        )),
                        new OpExp(
                            new NumExp(10),
                            OpExp.Times,
                            new IdExp("a")
                        )
                    )
                ),
                new PrintStm(new LastExpList(
                    new IdExp("b")
                ))
            )
        );

        System.out.println("Maximum arguments in a `print` statement in `program` = " + program.maxargs());
    }
}
