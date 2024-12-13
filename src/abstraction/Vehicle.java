package abstraction;

public interface Vehicle {
    public void run();  //Method declaration

    public void fuel();

    public void roadTax();

    public static void abc(){
        System.out.println("Vehicle abc static method");
    }

    public default void abc1() {
        System.out.println("Vehicle abc default method");
    }
}
