package Algos.SortingAlgo;

public class BubbleSort {

    public static double[] bubbleSort(double[] arr){
        if(arr.length<=1){
            return arr;
        }
        double temp;
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

        return arr;
    }
    public static  void main(String[] args){
        double[] arr = {5,2,3,0,1,4};
        arr = bubbleSort(arr);
        for(double a : arr)
        System.out.println(a);
    }
}
