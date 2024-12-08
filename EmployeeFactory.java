public class EmployeeFactory {

    // /get the Employee
    public static Emplyoee getEmplyoee(String empType){

        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        }else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }
        return null;
    }



}