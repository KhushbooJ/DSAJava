package main.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNums {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>();
        int rowMin = Integer.MAX_VALUE;
        int columnMax = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= rowMin) {
                    rowMin = matrix[i][j];
                }
//                if(matrix[j][i] >= columnMax) {
//                    columnMax = matrix[j][i];
//                }

                if (matrix[i][j] <= rowMin) {
                    luckyNums.add(matrix[i][j]);
                }
            }
        }

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[j][i] >= columnMax) {
                    columnMax = matrix[j][i];
                }
            }
        }


        return luckyNums;
    }
}
