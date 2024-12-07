package staticKeyword;

public class Counter {
    static int number;//1,2,3

    Counter() {
        number++;
        System.out.println("constructor called");
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(c2.number);
        System.out.println(c1.number);
        System.out.println(c.number);

    }
}
