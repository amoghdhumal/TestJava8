/*package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandling3 {

    public static void main(String[] args) {
        int []sumNumber= {1,2,3,4};
        int key=0;
        
        
        process(sumNumber,key,(v,k)->System.out.println(v/k));
        
    }

    private static void process(int[] sumNumber, int key,BiConsumer<Integer, Integer>consumer) {
        // TODO Auto-generated method stub
        for(int i:sumNumber) {
            consumer.accept(i, key);
        }
    }
}
*/