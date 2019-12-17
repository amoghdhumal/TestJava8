package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int []sumNumber= {1,2,3,4};
        int key=2;
        
        
        process(sumNumber,key,wrapperLamda((v,k)->System.out.println(v/k)));
        
    }

    private static void process(int[] sumNumber, int key,BiConsumer<Integer, Integer>consumer) {
        // TODO Auto-generated method stub
        for(int i:sumNumber) {
            consumer.accept(i, key);
        }
    }
    
    private static BiConsumer<Integer,Integer>wrapperLamda(BiConsumer<Integer, Integer>consumer) {
        return (v,k)->System.out.println(v/k);
    }
}
