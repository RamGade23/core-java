package thisKeyword;

public class A {
    //int number;

    A() {
        this(5);
        System.out.println("hello a");
    }

    A(int x) {
        this(4, "Saurabh");
        System.out.println(x);
    }

    A(int x, String b) {
        System.out.println(x + " " + b);
    }

    void m() {
        this.printMsg();
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        m();//same as this.m()
        //this.m();
    }

    void printMsg() {
        System.out.println("Hello you are in the Print Msg");
    }
}
