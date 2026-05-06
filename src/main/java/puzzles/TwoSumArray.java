package main.java.puzzles;

import java.util.HashSet;

public class TwoSumArray {

    public static void main(String[] args) {
        if(isSum(new int[]{1,2,5,-3,6,-7}, 2)) {
            System.out.println("array has sum elements");
        } else {
            System.out.println("array has no sum elements");
        }
    }

    private static boolean isSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr) {
            set.add(val);
        }

        for(Integer key : set) {
            if (set.contains(target - key)) {
                return true;
            }
        }
        return false;
    }
}
