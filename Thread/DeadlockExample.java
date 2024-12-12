package Thread;

public class DeadlockExample {
    public static void main(String[] args) {
        // final Resource resource1 = new Resource();
        // final Resource resource2 = new Resource();

        Thread thread1 = new Thread(() -> {
            synchronized (this) {
                System.out.println("Thread 1: Holding resource 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) { }
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");
                try { Thread.sleep(100); } catch (InterruptedException e) { }
                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
class Resource {
    // void method1() {
    //     synchronized (this) {
    //         System.out.println(Thread.currentThread().getName() + " is holding Resource 1");
    //         try { 
    //         Thread.sleep(100); }
    //          catch (InterruptedException e) {
                
    //       }
    //         System.out.println(Thread.currentThread().getName() + " waiting for Resource 2");
    //     }
    // }

    // void method2() {
    //     synchronized (this) {
    //         System.out.println(Thread.currentThread().getName() + " is holding Resource 2");
    //         try { Thread.sleep(100); } catch (InterruptedException e) { }
    //         System.out.println(Thread.currentThread().getName() + " waiting for Resource 1");
    //     }
    // }
}
