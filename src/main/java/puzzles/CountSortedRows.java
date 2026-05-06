package main.java.puzzles;

public class CountSortedRows {

    public static void main(String arg[])
    {
        int m = 4, n = 5;
        int mat[][] = { { 1, 2, 3, 4, 5 },
                { 4, 3, 1, 2, 6 },
                { 8, 7, 6, 5, 4 },
                { 5, 7, 8, 9, 10 } };
        int result = sortedIncCount(mat)+sortedDecCount(mat);
        System.out.print(result);
    }

    private static int sortedIncCount(int[][] mat) {
        int count = 0;

        for (int i=0;i < mat.length;i++) {
            boolean sorted = true;
            for (int j=0;j<mat[0].length-1;j++) {
                if(!(mat[i][j] > mat[i][j+1])) {
                    sorted = false;
                    break;
                }
            }
            if(sorted) count++;
        }
        return count;
    }

    private static int sortedDecCount(int[][] mat) {
        int count = 0;

        for (int i=0;i < mat.length;i++) {
            boolean sorted = true;
            for (int j=mat[0].length-1;j>0;j--) {
                if(!(mat[i][j] > mat[i][j-1])) {
                    sorted = false;
                    break;
                }
            }
            if(sorted) count++;
        }
        return count;
    }
}
