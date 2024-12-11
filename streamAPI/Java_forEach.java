package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java_forEach {

    

    public static void main(String[] args) {
      
     List<Integer> nums=Arrays.asList(1,5,1,2,6,8);

    //  Stream <Integer> data= 
     int result=nums.stream()
     .filter(n->n%2==1)
     .sorted()
     .map(n->n*2)
     .reduce(0,(a,b)->a+b);
    
    System.out.println(result) ;
     //   long count=data.count();
    //   System.out.println(count);

    //  data= data.sorted();
        // data=data.smap(n->n*2);

    //  for(int n:nums){
    //     System.out.println(n*2);
    //  }


    //  data.forEach(e->System.out.println(e));
    //  data.forEach(e->System.out.println(e)); 
    // stream has already been operated upon or closed
     
    }
}