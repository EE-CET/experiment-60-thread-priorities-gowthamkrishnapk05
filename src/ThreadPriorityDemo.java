class PriorityThread extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) throws InterruptedException {

        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start(); t1.join();
        t2.start(); t2.join();
        t3.start(); t3.join();
    }
}