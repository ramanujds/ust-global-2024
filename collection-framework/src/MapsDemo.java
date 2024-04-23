import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {

    public static void main(String[] args) {

        Map<Integer,String> myMap = new LinkedHashMap<>();

        myMap.put(100,"Dog");
        myMap.put(8,"Cat");
        myMap.put(3,"Cow");
        myMap.put(40,"Horse");

       for (var key:myMap.keySet()){
           System.out.println(myMap.get(key));
       }

    }

}
