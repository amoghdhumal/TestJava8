package unit3;

public class MethodReferenceExample {

public static void main(String[] args) {
    
    Thread t = new Thread(()->printMessage());
    t.start();
    
    //Now replace above lamda with methid reference
    
    Thread t1 = new Thread(MethodReferenceExample::printMessage);
    t1.start();
}

public static void printMessage() {
    System.out.println("Welcome to method reference");
}
}
