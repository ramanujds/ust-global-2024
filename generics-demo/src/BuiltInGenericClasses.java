import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BuiltInGenericClasses {

    public static void main(String[] args) {

//        List<String> names = List.of("Javed","Karan","Priya","Mohit");
//
//        for(String person:names){
//            System.out.println(person.toUpperCase());
//        }

        List<? super String> nums = List.of(10,10.5,20,61.29F,new Item("iPad",60000));
        nums.forEach(n-> System.out.println(n));

    }

}
