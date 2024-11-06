import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    // Produce an item and add it to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("Buffer is full, producer is waiting...");
            wait(); // Wait until there's space in the buffer
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify the consumer that there is data available
    }

    // Consume an item from the buffer
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting...");
            wait(); // Wait until there's an item to consume
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify the producer that there is space available
        return item;
    }
}

// Producer class
class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int item = 0;
        while (true) {
            try {
                buffer.produce(item++);
                Thread.sleep(500); // Simulate time to produce an item
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }
    }
}

// Consumer class
class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(1000); // Simulate time to consume an item
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }
    }
}

// Main class to test Producer-Consumer
public class Exercise7D {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Create a buffer with a capacity of 5
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
