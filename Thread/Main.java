package Thread;

public class Main {

    

    public static void main(String[] args) {
        

        MyThread t1=new MyThread();


        Thread thread=new Thread(t1);

        // Start() -- > java.lang.Thread

        thread.start();
 
        // creating a new Thread


        Runnable at1=new Runnable(){
            public void run(){
                System.out.println("Hello this is a thread");
            }
        };

        Thread t2=new Thread(at1);
        t2.start();


        Runnable r=()->System.out.println("This is a thread");


        
    }
}