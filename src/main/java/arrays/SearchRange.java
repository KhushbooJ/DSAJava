package main.java.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class SearchRange {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{2,3,4,5,5,5,5,5,6,7,9,10}, 5)));
    }

        public static int[] searchRange(int[] nums, int target) {

            if (nums.length == 1 && nums[0] == target) {
                return new int[]{0, 0};
            }

            int start = recursiveSearch(nums,target,true);
            int end = recursiveSearch(nums,target,false);
            return new int[]{start,end};
        }

    private static int recursiveSearch(int[] nums, int target, boolean isStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
