package streamAPI;


import java.util.*;
import java.util.stream.Stream;
public class MapAndFlatMap {

    public static void main(String[] args) {
        

        String str[]={"Piyush","Ranjan","Amit","Rajat","Rajesh"};

        // Stream.of(str).map(String::toUpperCase).forEach(e->System.out.println(e)) ;

        List<List<String>> nestedList= Arrays.asList(
            Arrays.asList("Piyush","Ranjan"),
            Arrays.asList("Rajesh","Ranjan"),
            Arrays.asList("Amit","Kumar")
        );


       String str1= String.join("%","String","Piyush", "Ranjan");
        System.err.println(str1);
       nestedList.stream().flatMap(List::stream).map(String::toUpperCase).forEach(e->System.out.println(e));
   
    }
}