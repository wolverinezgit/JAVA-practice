import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collectionsss {
    public static void main(String[] args) {
        HashMap<String,Integer> h1=new HashMap<>();
        h1.put("Harsh",1);
        h1.put(null,2);

//        h1.forEach((x1,x2)->{
//            System.out.println("Key="+x1+" Value = "+x2);
//        });




        Iterator it=h1.entrySet().iterator();

    }
}
