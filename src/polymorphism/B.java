package polymorphism;

public class B {
    public static void sum() {
        System.out.println("inside sum");
    }

    public static void sum(int a) {
        System.out.println("inside sum with a");
    }

    public static void sum(int a, int b) {
        System.out.println("inside sum with a and b");
    }

    public static void sum(float a, float b) {
        System.out.println("inside sum with float a and b");
    }

    public static void sum(String a) {
        System.out.println("inside string with a");
    }

    public static void sum(Object a) {
        System.out.println("inside object with a");
    }

    public static void main(String[] args) {

        B b = new B();
        //sum();
        //sum(4, 5);
        //sum("6");
        sum(null);
        //sum(4.5f, 5.7f);
    }
}
