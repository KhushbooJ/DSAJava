package main.java.puzzles;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class MatrixSortColumn {

    public static void main(String[] args) {
        // Input
        int[][] mat = { { 1, 6, 10 },
                { 8, 5, 9 },
                { 9, 4, 15 },
                { 7, 3, 60 } };

        int row = mat.length;
        int col = mat[0].length;
        int[][] result = new int[row][col];
        for(int i=0;i<col;i++) {
            SortedSet<Integer> sortedColSet = new TreeSet<>();
            for (int j=0;j<row;j++) {
                sortedColSet.add(mat[j][i]);
            }

            transposeOutput(sortedColSet, i, result);

        }

        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }

    }

    private static void transposeOutput(SortedSet<Integer> sortedColSet, int j, int[][] result) {

        int i = 0;
        for (Integer val : sortedColSet) {
            result[i][j] = val;
            i++;
        }
    }

}
