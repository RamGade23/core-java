package oops;

public class Employee1 {
    int id;
    String name;
    String address;

    Employee1() {
        System.out.println("inside constructor");
    }

    Employee1(int i, String n, String a) {
        System.out.println("inside parameterised constructor");
        id = i;
        name = n;
        address = a;
    }

    public static void main(String[] args) {
        //1. Initializing Object using reference variable
        Employee1 employee1 = new Employee1();
        employee1.id = 101;
        employee1.name = "Roham";
        employee1.address = "Solapur";
        employee1.printObject();

        //2. Initializing Object using method
        Employee1 employee2 = new Employee1();
        employee2.instantiateValues(102, "Rahul", "Pune");
        employee2.printObject();

        Employee1 employee4 = new Employee1();
        employee4.instantiateValues(102, "Rahul", "Pune");
        employee4.printObject();

        //3. Initializing Object using constructor
        Employee1 employee3 = new Employee1(103, "Nikhil", "Pune");
        employee3.printObject();
    }

    public void instantiateValues(int i, String n, String a) {
        id = i;
        name = n;
        address = a;
    }

    void printObject() {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("address : " + address);
    }
}
