package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void insert(int [] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args){
        int [] arr={5,3,1};
        insert(arr);
        System.out.println("the sorted array "+ Arrays.toString(arr));
    }
}
