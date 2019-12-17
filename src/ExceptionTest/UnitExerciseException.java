package ExceptionTest;

import java.util.Arrays;
import java.util.List;

import io.Person;

public class UnitExerciseException extends Exception{

    public UnitExerciseException() {
        super();
        // TODO Auto-generated constructor stub
        
    }
    
    
    public UnitExerciseException(String message) {
        super(message);
        System.out.println("Localized message");
        
    }
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("charles", "john", 60), new Person("johney", "walker", 42), new Person("desi", "wall", 10),
                new Person("brand", "wallker", 55));
        
        

        // 1. sort list by last name

        // 2. Create a method to print all elements in list

        // 3. create a method to print all people that have name begin with w

    }

   
}
