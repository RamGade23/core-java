package abstraction;

public abstract class Human {

    public abstract void eat();

    public void run() {
        System.out.println("Human Running");
    }

    public static void sleep() {
        System.out.println("Human is sleeping");
    }

    public final void walk() {
        System.out.println("human is walking");
    }
}
