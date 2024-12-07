package oops;

public class Employee2 implements Cloneable {
    int id;
    String name;
    String address;

    Employee2() {
    }

    Employee2(String n) {
        name = n;
    }

    public Employee2(String n, String a) {
        System.out.println("two arg constructor");
        name = n;
        address = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //factory method
    public static Employee2 getinstance() {
        return new Employee2();
    }

    public void print() {
        System.out.println(id + " " + name + " " + address);
    }

    public static void main(String[] args) throws Exception {
        //Create object using new keyword
        Employee2 employee2 = new Employee2("Amit", "Mumbai");
        System.out.println(employee2.id + " " + employee2.name + " " + employee2.address);
        employee2.id = 8;
        //employee2.name = "Amit";
        employee2.address = "Pune";
        System.out.println(employee2.id + " " + employee2.name + " " + employee2.address);

        //By newInstance() method
        Employee2 employee3 = (Employee2) Class.forName("oops.Employee2").newInstance();
        employee3.id = 9;
        employee3.name = "Rohan";
        employee3.address = "Pune";
        System.out.println(employee3.id + " " + employee3.name + " " + employee3.address);

        //By clone() method
        Employee2 employee4 = (Employee2) employee2.clone();
        employee4.id = 10;
        employee4.name = "Priyanka";
        employee4.address = "Mumbai";
        System.out.println(employee4.id + " " + employee4.name + " " + employee4.address);

        //By factory method
        Employee2 employee5 = Employee2.getinstance();
        employee5.id = 11;
        employee5.name = "Diksha";
        employee5.address = "Pune";
        System.out.println(employee5.id + " " + employee5.name + " " + employee5.address);

        new Employee2("Pratibha", "Solapur").print();
    }
}
