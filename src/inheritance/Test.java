package inheritance;

public class Test {
    public static void main(String[] args) {
        /*B b = new B();
        System.out.println(b.y);
        System.out.println(b.x);
        b.msg();

        Car car = new Car();
        System.out.println(car.brand + " " + car.modelName);
        car.mileage();

        Bus bus = new Bus();
        System.out.println(bus.brand + " " + bus.model);
        bus.mileage();*/

        //10 Dec 2024
        Car car = new Car();
        System.out.println(car.brand + " " + car.modelName);
        //System.out.println(car.batteryRange);

        ElectricCar ev = new ElectricCar();
        System.out.println(ev.brand + " " + ev.modelName + " " + ev.batteryRange);
    }
}
