package welcometoaddressbook;
import java.util.Hashtable;
import java.util.Map;

public class Contact {
    public static void main(String[] args) {
        Map<Integer,String> hash = new Hashtable<>();
        hash.put(1,"FirstName");
        hash.put(2,"LastName");
        hash.put(3,"Address");
        hash.put(4,"City");
        hash.put(5,"State");
        hash.put(6,"Zip");
        hash.put(7,"PhoneNumber");
        hash.put(8,"Email");

        System.out.println(hash);

        for(Map.Entry value:hash.entrySet()){
            System.out.println(value.getKey() +" "+value.getValue());
        }
        System.out.println();

    }
}