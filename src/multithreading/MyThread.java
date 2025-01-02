package multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) { //Stage 3: running
            try {
                Thread.sleep(2000); //stage 4 : waiting for 2 seconds <-> running
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i); //Stage 3 : running
        }
    }

    public MyThread(String name) {
        super(name);
    }
}