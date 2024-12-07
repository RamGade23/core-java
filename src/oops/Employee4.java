package oops;

public class Employee4 {
    int id;
    String name;
    float salary;

    Employee4(){
        System.out.println("default constructor");
    }
    Employee4(int i, String n, float s){
        this(n, s);
        id = i;
        System.out.println("three agr constructor");
    }

    Employee4(String n, float s){
        this(s);
        System.out.println("two arg constructor");
        name = n;
    }

    Employee4(float s){
        System.out.println("one arg constructor");
        salary = s;
    }

    public static void main(String[] args) {
        Employee4 employee = new Employee4();
        System.out.println(employee.id + " " + employee.name + " " + employee.salary);

        Employee4 employee1 = new Employee4(101, "Vishal", 45000.00f);
        System.out.println(employee1.id + " " + employee1.name + " " + employee1.salary);
    }
}
