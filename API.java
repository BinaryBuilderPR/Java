import java.io.Serializable;

public class API implements Serializable {

    private static API api = null; // Initialize as null for lazy loading.

    private API() {
        // Private constructor to prevent instantiation.
       if(api!=null){
        throw new RuntimeException("You are trying to break singleton pattern");
       }
    }

    public static API getAPI() {
        if (api == null) { // First check (not synchronized)
            synchronized (API.class) { // Synchronize only if needed
                if (api == null) { // Second check (thread-safe)
                    api = new API();
                }
            }
        }
        return api;
    }


       // This method ensures that the singleton instance is returned after deserialization
       private Object readResolve() {
        return getAPI();
 
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return api;  // Creates a shallow copy
    }

}
