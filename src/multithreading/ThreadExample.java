package multithreading;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("abc-1"); //stage 1 : New
        MyThread t2 = new MyThread("abc-2"); //stage 1 : New
        t1.start(); //stage 2 : Runnable
        t2.start(); //stage 2 : Runnable
        //Thread.sleep(2000);
        //System.out.println("inside main method");
        //t1.setName("XYZ");
        //System.out.println("t1.getName() : " + t1.getName());

        /*ThreadWithRunnable threadWithRunnable = new ThreadWithRunnable();
        Thread thread = new Thread(threadWithRunnable);
        Thread thread1 = new Thread(threadWithRunnable);
        thread.setName("t-1");
        thread1.setName("t-2");
        thread.start();
        thread1.start();*/
    }
}

