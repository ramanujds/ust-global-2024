package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int []arr = {10,20,5,6,1,7,9,2};
        quickSort(arr,0,arr.length-1);

        for (int element:arr){
            System.out.println(element+"\t");
        }
    }

   static int partition(int []arr,int start,int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j=start; j<end; j++){
            if(arr[j]<=pivot){
                i++;
                int iVal = arr[i];
                int jVal = arr[j];
                arr[i] = jVal;
                arr[j] = iVal;
            }
        }
        i++;
        int iVal = arr[i];
        arr[end]=iVal;
        arr[i]=pivot;
        return i;
    }

    static void quickSort(int []arr, int start, int end){
        if(start < end){
            int q = partition(arr,start,end);
            quickSort(arr,start,q-1);
            quickSort(arr,q+1,end);
        }
    }


}
