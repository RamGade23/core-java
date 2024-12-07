package staticKeyword;

public class Student {
    int id;
    String name;
    static String college = "JSPM";

    Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student(11, "Rohit");
        System.out.println(s.id + " " + s.name + " " + Student.college);

        Student.college= "DY PATIL";//class area -  DY PATIL
        System.out.println(s.id + " " + s.name + " " + Student.college);

        Student s1 = new Student(12, "Vikas");
        System.out.println(s1.id + " " + s1.name + " " + Student.college);

        Student s2 = new Student(11, "Vikas");
        Student.college= "JSPM";
        System.out.println(s2.college);
    }

    private void printStudentDetails() {
    }
}
