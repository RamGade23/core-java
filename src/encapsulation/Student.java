package encapsulation;

public class Student {
    private int rollNumber = 12;
    private String name = "Rohit";

    //Read-Only class using getter methods
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }


    //Write-Only class using getter methods
    /*public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
