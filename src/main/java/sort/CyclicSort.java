package main.java.sort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {5,1,6,4,2,3};
        sortCyclic(arr);
    }

    private static void sortCyclic(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            int index = arr[i]-1;
            if (i != index) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
