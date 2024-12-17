package stringInJava;

public class StringTest {

    public static void main(String[] args) {
        String a = "Welcome"; //SP
        String b = "welcome"; //existing SP
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
        String c = "akash";
        String d = "Rohit";
        String e = "Rohit";
        String f = a; //"Akash"
        String str = new String("Akash"); //new
        String st1 = str;
        String st2 = str.intern();


        System.out.println("a==b : " + (a == b));
        System.out.println("a==c : " + (a == c));
        System.out.println("a==d : " + (a == d));
        System.out.println("d==e : " + (d == e));
        System.out.println("d==f : " + (d == f));
        System.out.println("a==str : " + (a == str));
        System.out.println("st1==a : " + (st1 == a));
        System.out.println("st2==a : " + (st2 == a));
        System.out.println("str1==str2 : " + (st1 == st2));
        System.out.println("str1==str2 : " + (st1 == st2));
        System.out.println("st1==str : " + (st1 == str));

        System.out.println("a.equals(c) :" + a.equals(c));


    }
}
