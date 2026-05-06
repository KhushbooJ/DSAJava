package main.java.puzzles;

import java.util.TreeSet;

public class CheckValidMAtrix {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 3, 1, 2},
                { 2, 3, 1}};
            boolean isValid = true;
            for(int i=0;i<matrix.length;i++) {
                TreeSet<Integer> set1 = new TreeSet<>();
                TreeSet<Integer> set2 = new TreeSet<>();
                for(int j=0;j<matrix.length;j++) {
                    set1.add(matrix[i][j]);
                    set2.add(matrix[j][i]);
                }
                if(!set1.equals(set2))
                    isValid = false;
            }
            System.out.println(isValid);

    }
    }

