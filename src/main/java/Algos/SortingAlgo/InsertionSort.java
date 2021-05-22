package Algos.SortingAlgo;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
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
        InsertionSort ob = new InsertionSort();
        int arr[] = {64,25,12,22,11,11};
        ob.insertionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
