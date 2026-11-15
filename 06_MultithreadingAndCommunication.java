class SharedCounter {
    private int count = 0;

    synchronized void increase() {
        count++;
        System.out.println(Thread.currentThread().getName() + " updated count to " + count);
    }

    synchronized void waitForSignal() {
        try {
            System.out.println("Worker is waiting...");
            wait();
            System.out.println("Worker received the signal.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Worker was interrupted.");
        }
    }

    synchronized void sendSignal() {
        System.out.println("Main thread is sending a signal.");
        notify();
    }
}

public class MultithreadingAndCommunication {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        Thread first = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                counter.increase();
            }
        }, "Thread-1");

        Thread second = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                counter.increase();
            }
        }, "Thread-2");

        Thread waitingThread = new Thread(counter::waitForSignal, "Waiting-Thread");

        first.start();
        second.start();
        waitingThread.start();

        try {
            first.join();
            second.join();
            Thread.sleep(500);
            counter.sendSignal();
            waitingThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished.");
    }
}
