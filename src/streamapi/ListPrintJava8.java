package streamapi;

import java.util.ArrayList;
import java.util.List;

public class ListPrintJava8 {

    public static void main(String[] args) {
        
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //method refference
        items.forEach(System.out::println);

        //lambda
        //Output : A,B,C,D,E
        items.forEach(item->System.out.println(item));
            
        //Output : C
        items.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });
    }
}
