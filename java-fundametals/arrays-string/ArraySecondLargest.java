import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class ArraySecondLargest {

    public static void main(String[] args) {

        int arr[] = { 2, 8, 9, 3, 6, 7, 10 };

        // ConcurrentHashMap

        // Arrays.sort(arr);

        // O(n log(n))

        // int n = arr.length;

        // int temp = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] > arr[j]) {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        // O(n^2)

        int max = arr[0];
        int max2 = arr[0];

        for(int num : arr){
            if(num>max){
                max = num;
            }
        }

        for(int num : arr){
            if(num>max2 && num<max){
                max2 = num;
            }
        }



        System.out.println("Second Largest = " + max2);

    }

}
