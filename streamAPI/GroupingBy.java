package streamAPI;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{

    String name;
    int salary;
    String role;
    public Employee(String name, int salary, String role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    String  getRole(){
        return role;
    }
    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", role=" + role + "]";
    }

   
}
public class GroupingBy {

    

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();

        // Add Employee objects to the List
            employees.add(new Employee("Piyush", 30000, "Software Developer"));
            employees.add(new Employee("Rahul", 40000, "Project Manager"));
            employees.add(new Employee("Anita", 25000, "Quality Analyst"));
            employees.add(new Employee("Amit", 40000, "Project Manager"));
           

           Map<String,List<Employee>> empGroup=  employees.stream().collect(Collectors.groupingBy(Employee::getRole));


           empGroup.forEach((k,v)->System.out.println("K:"+k+" V:"+v));

           String str[]={"Piyush","Ranjan","Amit","Rajat","Rajesh"};



          Stream
          .of(str)
          .collect(Collectors
          .groupingBy(String::length))
          .forEach((k,v)->System.out.println("length: "+k+" v:"+v));

        //    System.out.println(str.length);



    } 
}