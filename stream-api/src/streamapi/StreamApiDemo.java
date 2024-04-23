package streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiDemo {


    public static void main(String[] args) {

        List<Integer> list = List.of(2, 3, 5, 6, 10);

        int sum = list.stream().filter(i -> i % 2 == 0)
                .mapToInt(i -> i * i)
                .sum();

        System.out.println("Sum = " + sum);

    }

}
