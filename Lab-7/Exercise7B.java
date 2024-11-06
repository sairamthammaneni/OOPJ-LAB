class MyThread extends Thread {
    private String message;
    private int sleepTime;

    public MyThread(String message, int sleepTime) {
        this.message = message;
        this.sleepTime = sleepTime;
    }

    public void run() {
        try {
            System.out.println(message + " thread is starting.");
            Thread.sleep(sleepTime);
            System.out.println(message + " thread has completed.");
        } catch (InterruptedException e) {
            System.out.println(message + " thread was interrupted.");
        }
    }
}

public class Exercise7B {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1", 2000);
        MyThread t2 = new MyThread("Thread 2", 4000);
        MyThread t3 = new MyThread("Thread 3", 6000);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        try {
            // Checking if t1 is alive
            System.out.println("Is t1 alive? " + t1.isAlive());

            // Wait for t1 to complete
            t1.join();
            System.out.println("t1 has finished. Is t1 alive? " + t1.isAlive());

            // Checking if t2 is alive
            System.out.println("Is t2 alive? " + t2.isAlive());

            // Wait for t2 to complete
            t2.join();
            System.out.println("t2 has finished. Is t2 alive? " + t2.isAlive());

            // Checking if t3 is alive
            System.out.println("Is t3 alive? " + t3.isAlive());

            // Wait for t3 to complete
            t3.join();
            System.out.println("t3 has finished. Is t3 alive? " + t3.isAlive());

        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished execution.");
    }
}
