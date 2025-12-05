package Sorting;

import java.sql.SQLOutput;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("sorted array");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
