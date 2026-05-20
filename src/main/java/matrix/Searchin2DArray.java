package main.java.matrix;

import java.util.Arrays;

public class Searchin2DArray {

    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,33,38,50}};
        System.out.println(Arrays.toString(findTargetinArray(arr, 0)));
    }

    private static int[] findTargetinArray(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length-1;

        while (row<=col) {
            if(target == arr[row][col]){
                return new int[]{row,col};
            } else
            if(target > arr[row][col]) {
                row++;
            } else
            if(target < arr[row][col]){
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
