package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static List<Integer> findEvens(List<Integer> list){
       return list.stream()
                   .filter(num -> num % 2 == 0)
                   .collect(Collectors.toList());
    }

    public static List<Integer> getSquaredList(List<Integer> list){
        return list.stream()
                   .map(num -> num * num)
                   .collect(Collectors.toList());
    }

    public static int getSum(List<Integer> list){
      return list.stream()
               .reduce(0, (acc, num) -> acc + num);
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(2,3,5,6,10);

        List<Integer> evens = findEvens(list);

        List<Integer> squares = getSquaredList(evens);

        int sum = getSum(squares);

        System.out.println("Sum = "+sum);

    }

}
