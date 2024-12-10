package accessModifiers;

public class A {
    public int x = 10;

    void print() {
        System.out.println("inside print method : " + this.x);
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
        a.print();
    }
}
