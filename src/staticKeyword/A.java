package staticKeyword;

public class A {
    static int b;

    static {
        System.out.println("welcome to static block");
        b = 12;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to main method");
        System.out.println(A.b);
        A.b = 13;
        System.out.println(A.b);
    }
}
