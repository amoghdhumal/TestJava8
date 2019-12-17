package unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.Person;

public class MethodReferenceExample2 {

    
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("charles", "john", 60), new Person("johney", "walker", 42), new Person("besi", "wall", 10),
                new Person("brand", "wallker", 55));

        // 1. sort list by last name
    //    Collections.sort(people, (p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
        // 2. Create a method to print all elements in list
        
      //  printAll(people);

      //  performConditionallly(people, p->true,p->System.out.println(p));
        // 3. create a method to print all people that have name begin with w
     //   System.out.println("Print last name start with w");
     //   performConditionallly(people, p->   p.getLastName().startsWith("w"),p->System.out.println(p.getLastName())); 
       //         System.out.println("Print first name start with b");
        
        System.out.println("Using for loop");
        for(int i=0;i<people.size();i++) {
            System.out.println( people.get(i));
        }
        
        System.out.println("Using for loop");
        for(Person p :people) {
            System.out.println( p);
        }

        System.out.println("Using foreach loop");
        
        people.forEach(System.out::println);
        
        //System.out.println("Printing all persons from list");
             //   performConditionallly(people, p->true,p->System.out.println(p));
          //      performConditionallly(people, p->true, System.out::println); //()->method(p)

    }
 
    private static void performConditionallly(List<Person> people, Predicate<Person>predicate, Consumer<Person>consumer) {
        // TODO Auto-generated method stub
        for (Person p : people) {
            if (predicate.test(p))
                consumer.accept(p);
        }
    }

  /*  private static void printAll(List<Person> people) {
        // TODO Auto-generated method stub
        for (Person p : people) {
            System.out.println(p);
        }
    }
*/
}

