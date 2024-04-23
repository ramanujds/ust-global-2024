package streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamApiDemo {

    public static List<Integer> findEvens(List<Integer> list){
        List<Integer> evens = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public static List<Integer> getSquaredList(List<Integer> list){
        List<Integer> squares = new ArrayList<>();
        for (Integer num : list) {
            squares.add(num * num);
        }
        return squares;
    }

    public static int getSum(List<Integer> list){
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(2,3,5,6,10);

        List<Integer> evens = findEvens(list);

        List<Integer> squares = getSquaredList(evens);

        int sum = getSum(squares);

        System.out.println("Sum = "+sum);

    }

}
