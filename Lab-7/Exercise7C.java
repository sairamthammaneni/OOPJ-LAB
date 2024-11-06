class DaemonThreadExample extends Thread {
    public void run() {
        // Checking if this thread is a daemon thread
        if (isDaemon()) {
            System.out.println(getName() + " is a daemon thread.");
        } else {
            System.out.println(getName() + " is a user thread.");
        }

        // Infinite loop to keep the daemon thread running
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " executing iteration " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " finishing execution.");
    }
}

public class Exercise7C {
    public static void main(String[] args) {
        // Creating two threads: one daemon and one user
        DaemonThreadExample daemonThread = new DaemonThreadExample();
        DaemonThreadExample userThread = new DaemonThreadExample();

        // Set daemonThread as a daemon thread
        daemonThread.setDaemon(true);
        daemonThread.setName("DaemonThread");
        userThread.setName("UserThread");

        // Start both threads
        daemonThread.start();
        userThread.start();

        // Main thread sleeping for a short time to allow observing the daemon thread
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finishing execution.");
    }
}
