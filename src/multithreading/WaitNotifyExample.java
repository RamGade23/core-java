package multithreading;

class WaitNotifyExample {

    private static final Object lock = new Object();

    static class Producer extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println("line -1 " + Thread.currentThread().getName());
                    System.out.println("line -2 " + Thread.currentThread().getName());
                    Thread.sleep(8000);
                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public Producer(String name) {
            super(name);
        }
    }

    static class Consumer extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    System.out.println("line -1 " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("line -2 " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public Consumer(String name) {
            super(name);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Consumer consumer = new Consumer("Consumer");
        Producer producer = new Producer("Producer");
        consumer.start();
        producer.start();
    }
}
