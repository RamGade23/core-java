package oops;

public class House {
    String address;
    String name;
    int number;
    String color;

    void living() {
        System.out.println("We are living in the house");
    }

    void onRent() {
        System.out.println("It is on rent");
    }

    void print() {
        System.out.println("name :"+this.name+", address : "+this.address+", number : "+this.number+", color : "+this.color);
    }

    void assignValues(String address, String name, int number, String color) {
        this.address = address;
        this.name = name;
        this.number = number;
        this.color = color;
    }

    public static void main(String[] args) {
        House flat_101 = new House();
        flat_101.address = "Bandra, Mumbai";
        flat_101.name = "Mannat";
        flat_101.number = 101;
        flat_101.color = "Grey";
        flat_101.living();
        flat_101.print();

        //assign values to member variable using direct variable
        House flat_102 = new House();
        flat_101.address = "Wakad, Pune";
        flat_101.name = "xyz";
        flat_101.number = 102;
        flat_101.color = "Red";
        flat_101.print();

        //assign values to member variable using method
        House flat_103 = new House();
        flat_103.assignValues("Mumbai", "Antilia", 103, "White");
        flat_103.print();


        House flat_104 = new House();
    }

    static class ABC {

    }

    interface B {

    }
}
