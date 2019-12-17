package io;

public class RunnableExample {
public static void main(String[] args) {
    Thread t = new Thread(new Runnable() {
        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println("Inside annaymous runnable interface. No need to create new class etc");
            
        }
    });
    
    t.run();
    
    Thread myLamdaFunctionTest = new Thread(()->System.out.println("Inside lamda ananymous class"));
    myLamdaFunctionTest.run();
}
}
