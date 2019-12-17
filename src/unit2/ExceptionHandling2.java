package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandling2 {

    public static void main(String[] args) {
        int[] sumNumber = { 1, 2, 3, 4 };
        int key = 0;

        process(sumNumber, key, (v, k) -> {
            try {
                System.out.println(v / k);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Arithmatic Exception");
            }
        });

    }

    private static void process(int[] sumNumber, int key, BiConsumer<Integer, Integer> consumer) {
        // TODO Auto-generated method stub
        for (int i : sumNumber) {
            consumer.accept(i, key);
        }
    }
}
