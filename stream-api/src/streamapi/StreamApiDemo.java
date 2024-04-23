package streamapi;

import java.util.List;

public class StreamApiDemo {

    public static List<Integer> findEvens(List<Integer> list){
        return null;
    }

    public static List<Integer> getSquaredList(List<Integer> list){
        return null;
    }

    public static int getSum(List<Integer> list){
        return 0;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(2,3,5,6,10);

        List<Integer> evens = findEvens(list);

        List<Integer> squares = getSquaredList(evens);

        int sum = getSum(squares);

        System.out.println("Sum = "+sum);

    }

}
