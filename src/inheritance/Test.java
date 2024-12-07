package inheritance;

public class Test {
    public static void main(String[] args) {

        /*B b = new B();
        System.out.println(b.y);
        System.out.println(b.x);
        b.msg();*/

        Car car = new Car();
        System.out.println(car.brand + " " + car.modelName);
        car.milage();

        Bus bus = new Bus();
        System.out.println(bus.brand + " " + bus.model);
        bus.milage();

    }
}
