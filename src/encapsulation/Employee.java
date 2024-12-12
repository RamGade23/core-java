package encapsulation;

public class Employee {
    private String name;//Rohan
    private int empId; //0

    //setter methods
    public void setName(String n) {
        this.name = n;
    }

    public void setEmpId(int id) {
        if (id < 0) {
            System.out.println("please enter positive employee id greater than 100");
            return;
        }
        if (id < 101) {
            System.out.println("please enter employee id greater than 100");
            return;
        }
        this.empId = id;
    }

    //getter methods
    public String getName() {
        return this.name;
    }

    public int getEmpId() {
        return this.empId;
    }

    public int salary() {
        return 55000;
    }
}
