// import Employee.*;
public class DeveloperClient{

    public static void main(String args       []){

        // Emplyoee employee =new AndroidDeveloper();
        // System.out.println(employee.salary());
         Emplyoee employee=EmployeeFactory.getEmplyoee("ANDROID developer");
        System.out.println(employee.salary());
    }


    
}