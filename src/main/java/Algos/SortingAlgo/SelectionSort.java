package Algos.SortingAlgo;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int h;
        for(h=arr.length-1; h>0; h--){
            int max = h;
            for(int j=h-1; j>=0; j--){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            if(max!=h){
                int temp = arr[max];
                arr[max] = arr[h];
                arr[h] = temp;
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
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11,11};
        ob.selectionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
