package polymorphism;

public class A {
    public static void msg(){
        System.out.println("inside msg");
    }
    public static void msg(String a) {
        System.out.println("inside msg with a");
    }
    public static void msg(String a, String b) {
        System.out.println("inside msg with a and b");
    }

    public static void main(String[] args) {
        msg();
        msg("abc");
        msg("a", "b");
    }
}
