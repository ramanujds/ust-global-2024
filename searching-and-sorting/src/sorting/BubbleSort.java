package sorting;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

    public static void main(String[] args) {
        int []arr = {6,2,8,5,9,4,1};
        int[] sorted = bubbleSort(arr);
        for (int num:arr){
            System.out.print(num+"\t");
        }

    }


    public static int[] bubbleSort(int []arr){

        int length = arr.length;

        for (int i=0; i<length-1; i++){
            for(int j = i+1; j<length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

}
