package main.java.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] sorted = bubbleSort(new int[]{89,56,5,34,101,33,1,0,999,250});
        System.out.println(Arrays.toString(sorted));
    }

    static int[] bubbleSort(int[] arr) {
            for(int i = 0; i < arr.length; i++) {

                boolean swapped = false;
                for(int j = 0; j < arr.length - 1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                    }


                }
                System.out.println("Temp"+Arrays.toString(arr));
                if(!swapped){
                    break;
                }
            }
        return arr;
    }
}
