package abstructDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstructFactory factory){
    return factory.creatEmployee(); 
    }
}