package io;

public class Greeter {

    public Greeter() {
        // TODO Auto-generated constructor stub
    }

    public void greet(Greetings greetings) {

        greetings.perform();
    }

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
      //  Greetings helloWorldGreeting = new HelloWorldGreeting();
        // greeter.greet(helloWorldGreeting);

        Greetings myLamdaFuinction = () -> System.out.println("Hello Worlds of lamda");

        Greetings greet = new Greetings() {

            @Override
            public void perform() {
                System.out.println("Ananymous Inner Class");
                // TODO Auto-generated method stub

            }
        };
        // greeter.greet(helloWorldGreeting);

        
        greeter.greet(myLamdaFuinction);
        greeter.greet(greet);
        
        myLamdaFuinction.perform();
        // AddLamda addLamda = (int a , int b)-> a+b;
    }
}

/*
 * interface MyLamda { void foo(); }
 * 
 * interface AddLamda{ int add(int a , int z);
 * 
 * }
 */