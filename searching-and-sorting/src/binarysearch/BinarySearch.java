package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        var arr = new int[] {10,20,25,35,40,52,65,74,88,93};
        int index = binarySearch(arr,52 );

        System.out.println("Index = "+index);
    }

    public static int binarySearch(int []arr, int item){
        int p=0;
        int r=arr.length-1;
        int q;
        while (p<=r){
            q =(p+r)/2;
            if(arr[q]==item){
                return q;
            }
            else if(arr[q]>item){
                r=q-1;
            }
            else {
                p = q+1;
            }
        }
        return -1;
    }

}
