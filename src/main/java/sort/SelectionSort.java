package main.java.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{89,56,5,34,101,33,1,0,-2,-3,999,250, 9, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int largest = arr.length-i-1;
            for (int j=0;j < arr.length-i; j++) {
                if (arr[j] > arr[largest]) {
                    int temp = arr[j];
                    arr[j] = arr[largest];
                    arr[largest] = temp;
                }
            }
        }
    }
}
