package streamAPI;

import java.util.stream.Collectors;
import java.util.stream.IntStream; 
import java.util.stream.Stream;
import java.util.*;r

public class StreamObject {
    


    public static void main(String[] args) {
        

        // 1 blank
        Stream<Object> emptyStream=Stream.empty();



        // 2 array, object , Collection 
         String names[]={"Piyush","Rajesh","Rajat","Jakiur"};

         Stream <String> nameStream=Stream.of(names);
         
        //  List<String> list1=nameStream.collect(Collectors.toList());
         List<String> list2=nameStream.toList();
         System.out.println(list2);
        //  nameStream.forEach(e->System.out.println(e)); 

        //3 builder 
        Stream <Object> streabuilder=Stream.builder().build();


        // 4 Arrays
        IntStream st2 = Arrays.stream(new int[]{2,2,65,7,3,7});
        
    }
}
