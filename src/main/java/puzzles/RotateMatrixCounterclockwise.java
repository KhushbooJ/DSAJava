package main.java.puzzles;


import java.util.Arrays;
import java.util.TreeSet;

public class RotateMatrixCounterclockwise {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotateMatrixCounterclockwise(mat);


        System.out.println(Arrays.deepToString(mat));

    }

    private static void rotateMatrixCounterclockwise(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] arr = new int[row*col];
        int index=0;
        for(int j=col-1;j>=0;j--){
            for (int i=0;i<row;i++){
                arr[index] = mat[i][j];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int k=0;k<arr.length;) {

            for(int i=0;i<row;i++){
                for (int j=0;j<col;j++){
                    mat[i][j] = arr[k];
                    k++;
                }
            }
        }
    }
}
