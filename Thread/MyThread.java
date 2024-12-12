package Thread;

public class MyThread implements Runnable{

    @Override
    public void run() {
        // Thread Task
        for (int i = 0; i <=20; i++) {
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    




}
