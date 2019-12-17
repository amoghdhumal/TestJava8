package unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.Person;

public class StreamApi {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("charles", "john", 60), new Person("johney", "walker", 42), new Person("besi", "wall", 10),
                new Person("brand", "wallker", 55));
    
    people.stream()
    .filter(p->p.getLastName().startsWith("w"))
    .forEach(p->System.out.println(p.getLastName()));

    
    long count = people.stream()
    .filter(p->p.getLastName().startsWith("w")).count();
    System.out.println("Total Elements in stream ===>"+count);
    
    }
    
    
}
