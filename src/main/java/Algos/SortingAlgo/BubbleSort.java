package Algos.SortingAlgo;

public class BubbleSort {

    public static void bubbleSort(int[] arr){

        int temp;
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]> arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static  void main(String[] args){
        BubbleSort ob = new BubbleSort();
        int arr[] = {64,25,12,22,11,11};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
