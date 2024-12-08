package abstructDesignPattern;

public class WebDevFactory extends EmployeeAbstructFactory {

    @Override
    public Employee creatEmployee() {
        return new WebDeveloper();

    }


    
}