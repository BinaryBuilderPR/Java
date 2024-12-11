package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        

        System.out.println("hello world");

        // Arrays.asList();

        // immutable
        List<Integer> list1=List.of(2,4,5,6,10);
        List<Integer> list2=Arrays.asList(2,3,1,5,6);
        
        // Muttable
        List<Integer> list3=new ArrayList<Integer>();
        list3.add(1);
        list3.add(3);
        list3.add(4);
        list3.add(6);
        // System.out.println(list3);



            Stream<Integer> stream = list1.stream();
            Stream evenList=stream.filter(n->n%2==0);
           
            List<Integer> list4= evenList.toList();//immutable
            
            //mutable 
            // List<Integer> list4= (List<Integer>)evenList.collect(Collectors.toList());

            // evenList.forEach(e->System.out.println(e));
            System.out.println(list4);
    


        }
}
