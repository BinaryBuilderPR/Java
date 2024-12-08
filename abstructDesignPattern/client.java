package abstructDesignPattern;

public class client {

    

    public static void main(String[] args) {
       Employee emp= EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(emp.salary());
        System.out.println(emp.name());
    }
}