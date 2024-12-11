package LambdaFunction;


// Create separate class and implments this interface 
// Anonymous class for impmenting inteface 
// Lamda function 

public class Main {



    interface InterfaceA {
      void display();
      void run();
    }
    
    interface InterfaceB {
        default void display() {
            System.out.println("InterfaceB display");
        }
    }
    abstract class abstructClass{
        abstract void display();
        abstract void displaya();

    }
    class MyClass extends abstructClass implements InterfaceA, InterfaceB {
        // Compiler error: duplicate default method
        public void display(){

        }
        public void run(){}
    }
    
    public static void main(String[] args) {
        System.out.println("Hello");

        // MyInter i=new MyInter() {
        //      @Override
        //          public
        //            void run() {
        //               System.out.println("This is my first anonymous class");
        //           }
        // };

        // i.run();


        // using our interface with the help of lambda
        MyInter i=()->System.out.println("This is first time im using lambda");
        i.run();

        SumInter i2=(a, b)->a+b;
        System.out.println(i2.sum(1, 10));


    }
}