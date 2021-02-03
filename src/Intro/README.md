# Modern Compiler Implementation in Java, 2e
## Chapter 1: Introduction
## Program: Straight-Line Program Interpreter
### Grammar
```
Stm → Stm ; Stm (CompoundStm)
Stm → id := Exp (AssignStm)
Stm → print ( ExpList ) (PrintStm)
Exp → id (IdExp)
Exp → num (NumExp)
Exp → Exp Binop Exp (OpExp)
Exp → ( Stm , Exp ) (EseqExp)
ExpList → Exp , ExpList (PairExpList)
ExpList → Exp (LastExpList)
Binop → + (Plus)
Binop → − (Minus)
Binop → × (Times)
Binop → / (Div)
```