package study.ListToMap;
import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;




public class NewTest {
    
 public static void main(String[] args) {


    
    List<String> list = new ArrayList<>();
    list.add(0,"Amogh");
    list.add(1,"Amol");
    list.add(2,"Sandeep");
    list.add(3,"Prasad");   
    list.add(4,"Amogh");
    list.add(5,null);

    
    System.out.println(list.size());
    
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    
    //
    System.out.println("Java 8 way to iterate over list");
    Map<String, Integer> map8 = list.stream().collect(toMap(s -> s, s -> s.length()));
    System.out.println(map8);
    
    map8 = list.stream().collect(
            toMap(Function.identity(), String::length));

    
    Map<String, Integer> map = new HashMap<>();
    for(String str:list) {
        map.put(str, str.length());
    }
    
    
    //now print value from the map
    System.out.println(map.size());
    
        
    
}
}


