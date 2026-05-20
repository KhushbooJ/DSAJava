package main.java.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4,2,3,2,1};
        System.out.println(Arrays.toString(sortCyclic(arr)));
    }

    private static int[] sortCyclic(int[] arr) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            int index = arr[i] - 1;
            if (i != index) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] != i + 1) {
                result.add(i+1);
            }
        }
        int[] res = new int[result.size()];
        for (int i=0;i<result.size();i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
