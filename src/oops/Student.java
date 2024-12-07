package oops;

import org.w3c.dom.ls.LSOutput;

public class Student {
    int id;
    String name;
    float age;

    //Default constructor
    Student() {

    }

    //Parameterised constructor
    Student(int i) {

    }

    //Parameterised constructor
    Student(int i, String n, float a) {

    }

    void printObj() {
        System.out.println("name : "+this.name+", id : "+this.id+", age : "+this.age);
    }

    void study() {

    }

    void travel() {

    }

    public static void main(String[] args) {
        Student rushi = new Student();
        rushi.id = 1;
        rushi.name = "Rushikesh";
        rushi.age = 22.5f;
        rushi.printObj();

        Student praful = new Student();
        praful.id = 2;
        praful.name = "Praful";
        praful.age = 23.5f;
        praful.printObj();

        Student diksha = new Student();
        diksha.id = 3;
        diksha.name = "Diksha";
        diksha.age = 23;
        diksha.printObj();

    }

    {
        System.out.println("ABC");
    }

    static {
        System.out.println();
    }

    class ABC{
        void msg(){
            System.out.println(name);
        }
    }
    interface A{

    }
}


