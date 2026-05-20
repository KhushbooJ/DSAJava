package main.java.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateCyclicSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        //12334
        System.out.println(sortCyclic(arr));
    }

    private static int sortCyclic(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - 1;
            if (i != index) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i=0;i<arr.length;i++) {
            if(i != arr[i] - 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
