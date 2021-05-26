package Algos.SortingAlgo;

public class CountingSort {

    public static void countingSort(int[] arr){
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int a=0; a< arr.length; a++){
            count[arr[a]]++;
        }
        for(int c=1; c< count.length; c++){
            count[c] += count[c-1];
        }
        int[] ans = new int[arr.length];
        for(int a =0; a< arr.length; a++){
            ans[count[arr[a]]-1] = arr[a];
            --count[arr[a]];
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int a: arr){
            if(a>max){
                max = a;
            }
        }
        return max;
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static  void main(String[] args){
        CountingSort ob = new CountingSort();
        int arr[] = {6,7,5,2,1,1};
        ob.countingSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
