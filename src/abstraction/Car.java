package abstraction;

public class Car implements Vehicle {

    @Override
    public void run() {
        System.out.println("this is Run method");
    }
    @Override
    public void fuel() {
        System.out.println("this is fuel method");
    }
    public void roadTax() {
        System.out.println("road tax method");
    }
}
