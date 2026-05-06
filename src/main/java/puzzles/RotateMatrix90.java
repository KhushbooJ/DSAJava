package main.java.puzzles;

import java.util.Arrays;

public class RotateMatrix90 {

    public static void main(String[] args) {
        // Test Case 1
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int row  = mat.length;
        int col = mat[0].length;
        // Function call to rotate the matrix
        int[] arr = rotateMatrix(mat,row,col);
        // Print the rotated matrix
        displayMatrix(arr, row, col);
    }

    private static void displayMatrix(int[] arr, int row, int col) {
        int[][] result = new int[col][row];
        int k = 0;
        for (int i = 0;i < col;i++){
            for (int j = 0;j < row;j++){
                result[i][j] = arr[k];
                k++;
            }
        }

        System.out.println(Arrays.deepToString(result));
    }

    private static int[] rotateMatrix(int[][] mat, int row, int col) {

       int[] arr = new int[row*col];
        int i = 0;
        for (int r=0; r<=row; r++) {
            for (int c=row-1; c>=0; c--) {
                arr[i] = mat[c][r];
                i++;
            }
        }

        return arr;
    }
}
