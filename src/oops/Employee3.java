package oops;

public class Employee3 {
    int id;
    String name;
    float salary;

    Employee3() {
        System.out.println("Welcome to non-arg Constructor");
    }

    Employee3(int i, String n, float s) {
        System.out.println("Welcome to parameterised Constructor");
        id = i;
        name = n;
        salary = s;
    }

    Employee3(int i, String n) {
        System.out.println("Welcome to two parameterised Constructor");
        id = i;
        name = n;
    }

    public Employee3(int i) {
        System.out.println("Welcome to single parameterised Constructor");
        id = i;
    }

    public void msg(int i, String s) {
        System.out.println("inside msg");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee class");

        //calling default constructor
        Employee3 employee3 = new Employee3();
        System.out.println(employee3.id + " " + employee3.name + " " + employee3.salary);

        //calling 3 arg constructor
        Employee3 employee4 = new Employee3(101, "Salman", 56000.00f);
        System.out.println(employee4.id + " " + employee4.name + " " + employee4.salary);

        //calling 2 arg constructor
        Employee3 employee5 = new Employee3(102, "Praful");
        System.out.println(employee5.id + " " + employee5.name + " " + employee5.salary);

        //calling 1 arg constructor
        Employee3 employee6 = new Employee3(103);
        System.out.println(employee6.id + " " + employee6.name + " " + employee6.salary);
    }
}
