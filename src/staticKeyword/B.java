package staticKeyword;

public class B {
    int number;
    String name;

    //default constructor
    B() {
    }

    //parameterised constructor
    public B(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void print() {
        System.out.println(number + " " + name);
    }
}
