package main.java.algo;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] sorted = selectionSort(new int[]{89,56,5,34,101,33,1,0,999,250, 9, 7});
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length -1 ; i++) {
            int smallestIndex = i;
            for (int j= i+1;j < arr.length; j++) {
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
        return arr;
    }
}
