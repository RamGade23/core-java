package stringInJava;

public class StringTest {

    public static void main(String[] args) {
        String a = "Welcome"; //SP
        String b = "Welcome"; //existing SP
        String c = new String("Welcome"); //Heap
        String d = new String("Welcome"); //new Heap
        String e = "Prasad"; //existing SP
        String f = new String("Prasad"); //existing SP
        String g = a; //SP

        // .equals() -> content comparison
        System.out.println("a.equals(b) : " + a.equals(b));
        System.out.println("a.equals(e) : " + a.equals(e));
        System.out.println("b.equals(e) : " + b.equals(e));
        System.out.println("b.equals(c) : " + b.equals(c));
        System.out.println("e.equals(d) : " + e.equals(d));
        System.out.println("e.equals(f) : " + e.equals(f));
        System.out.println("f.equals(e) : " + f.equals(e));
        System.out.println("a.equals(g) : " + a.equals(g));

        checkEqualsOperator();
    }

    private static void checkEqualsOperator() {
        // == -> reference comparison
        String a = "Akash"; //SP
        String b = "Rohit";
        String c = "Akash";
        String d = "Rohit";
        String e = "Rohit";
        String f = a; //"Akash"
        String str = new String("Akash"); //new

        System.out.println("a==b : " + (a == b));
        System.out.println("a==c : " + (a == c));
        System.out.println("a==d : " + (a == d));
        System.out.println("d==e : " + (d == e));
        System.out.println("d==f : " + (d == f));
        System.out.println("a==str : " + (a == str));

    }
}
