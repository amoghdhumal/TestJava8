package io;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("charles", "john", 60), new Person("johney", "walker", 42), new Person("besi", "wall", 10),
                new Person("brand", "wallker", 55));

        // 1. sort list by last name
        Collections.sort(people, (p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
        // 2. Create a method to print all elements in list
        
        printAll(people);

        printConditionallly(people, p->true);
        // 3. create a method to print all people that have name begin with w
        System.out.println("Print last name start with w");
        printConditionallly(people, p->   p.getLastName().startsWith("w")); 
                System.out.println("Print first name start with b");
        
                printConditionallly(people, p->p.getFirstName().startsWith("b"));

    }
 
    private static void printConditionallly(List<Person> people, Condition condition) {
        // TODO Auto-generated method stub
        for (Person p : people) {
            if (condition.test(p))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        // TODO Auto-generated method stub
        for (Person p : people) {
            System.out.println(p);
        }
    }

}

