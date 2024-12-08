package abstructDesignPattern;

public class AndroidDevFactory extends EmployeeAbstructFactory {

    @Override
    public Employee creatEmployee() {
        return new androidDeveloper();  
    }
   

    
    
}