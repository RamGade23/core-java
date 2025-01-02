package multithreading;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("abc"); //stage 1 : New
        t1.start(); //stage 2 : Runnable
        //Thread.sleep(2000);
        System.out.println("inside main method");
        //t1.setName("XYZ");
        //System.out.println("t1.getName() : " + t1.getName());
    }
}

