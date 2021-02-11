package Parser;

public class Main {

    public static void main(String [] args) {
        try {
            new MiniJavaParser(System.in).Program();
            System.out.println("Parsing successful");
        }
        catch (ParseException e) {
            System.out.println(e.toString());
        }
    }
}
