package streamapi;

import java.util.stream.Stream;

public class StreamBasic {
    
 public static void main(String[] args) {
     Stream<String> streamEmpty = Stream.empty();
     System.out.println(streamEmpty);
}    
}
