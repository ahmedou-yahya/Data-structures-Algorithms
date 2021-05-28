package Algos.SortingAlgo;

public class HeapSort {


    public void heapSort(int[] arr){
        int n = arr.length;
        for(int i = n / 2 - 1; i>=0; i--){
            heapify(arr,n, i);
        }

        for(int j=n-1; j>0; j--){

            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;

            heapify(arr, j, 0);
        }
    }

    void heapify(int[] arr, int n, int index){

        int leftIndex = 2*index+1;
        int rightIndex = 2*index+2;
        int largest = index;

        if(leftIndex<n && arr[leftIndex]>arr[largest]){
            largest = leftIndex;
        }
        if(rightIndex<n && arr[rightIndex]>arr[largest]){
            largest = rightIndex;
        }
        if(largest!=index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.heapSort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
