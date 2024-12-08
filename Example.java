import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.lang.reflect.Constructor;
import java.io.IOException;
import java.io.FileInputStream;

public class Example{


    public static void main(String args[]) throws Exception,IOException{

        System.out.println("Hello");

        API api=API.getAPI();
        System.out.println(api.hashCode());  
        

        // Constructor <API> constructor= API.class.getDeclaredConstructor();
        // constructor.setAccessible(true);

        // API api1=constructor.newInstance();

        // System.out.println(api1.hashCode());  


        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(api);

        System.out.println("Serialization Done..");

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
        API api2= (API) ois.readObject();
        System.out.println(api2.hashCode());



    }
}   