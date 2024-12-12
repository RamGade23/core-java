package encapsulation;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //employee.name = "Snehal";
        //employee.empId = 101;
        //System.out.println(employee.name + " " + employee.empId);

        /*employee.setName("Snehal");
        employee.setEmpId(101);
        System.out.println(employee.getName() + " " + employee.getEmpId());

        Employee rohan = new Employee();
        rohan.setName("Rohan");
        rohan.setEmpId(102);
        System.out.println(rohan.getName() + " " + rohan.getEmpId());*/

        /*Employee rohan = new Employee();
        rohan.setName("Rohan");
        rohan.setEmpId(-1);
        System.out.println(rohan.getName() + " " + rohan.getEmpId());*/

        Student student = new Student();
        //student.name ="dd";

        //Read-Only
        System.out.println(student.getName() + " " + student.getRollNumber());

        //Write-Only
        /*student.setName("dd");
        student.setRollNumber(10);*/



    }

    //101 999
}
