package polymorphism;

public class Child extends Parent{

    @Override
    public void display() {
        System.out.println("this is Child's display");
    }

    public void msg(String s) {
        System.out.println("child :" + s);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.msg("Hello");
    }
}
