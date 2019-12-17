package io;

public class TypeInference {

    
    public static void main(String[] args) {
        
//        StringLengthLamda myLamdaLength =s -> s.length();
//        System.out.println(myLamdaLength.getLength("welcome to string method"));
        printLamda(s -> s.length());
    }
    
    public static void printLamda(StringLengthLamda str) {
        System.out.println(str.getLength("Hello Lamda!"));
        
    }
    
    interface StringLengthLamda {
        int getLength(String s);
    }
}
