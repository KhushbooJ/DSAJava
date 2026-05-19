package main.java.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class SearchRange {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1,4}, 4)));
    }

        public static int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            int start = 0;
            int end = nums.length - 1;

            if (nums.length == 1 && nums[0] == target) {
                return new int[]{0, 0};
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > nums[mid]) {
                    start = mid + 1;
                }
                if (target < nums[mid]) {
                    end = mid - 1;
                }
                if (target == nums[mid]) {
                    if (mid > 0 && nums[mid - 1] == target) {
                        result[0] = mid - 1;
                        result[1] = mid;

                    } else if (mid + 1 < nums.length && nums[mid + 1] == target) {
                        result[0] = mid;
                        result[1] = mid + 1;
                    } else if (nums[mid] == target) {
                        return new int[]{mid,mid};

                    }
                    return result;
                }

            }
            return new int[]{-1, -1};
        }
}
