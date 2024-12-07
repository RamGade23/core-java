package oops;

public class Employee {
    //instance variable
    int id;
    String name;
    String mailId;

    public void msg() {
        //Local variable
        int a = 5;
        String b = "b";
        System.out.println("a : " + a);
        System.out.println("id : " + this.id);
    }

    public void msg1() {
        int c = 0;
        System.out.println("c : " + c);
    }

    public static void main(String[] args) {
        Employee s1 = new Employee();
        s1.msg();
        s1.msg1();

    }
}
