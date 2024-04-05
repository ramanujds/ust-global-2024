package demos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

   //     int []nums = new int[5];

        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.remove(1);

//       for (int n : nums){
//           System.out.println(n);
//       }



       nums.forEach(i -> System.out.println(i));


    }
}
