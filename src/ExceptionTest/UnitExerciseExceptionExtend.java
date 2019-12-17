package ExceptionTest;

public class UnitExerciseExceptionExtend  {

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to exception");
            throw new UnitExerciseException("Test Exception");
        } catch (UnitExerciseException ex) {
            System.out.println("Caught"); 

            System.out.println(ex.getMessage());
        }
    }

}
