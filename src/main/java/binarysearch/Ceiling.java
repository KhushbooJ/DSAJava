package main.java.binarysearch;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,7,8,10,11,56,99,104,122};
        System.out.println(ceilingNumber(arr, 103));
    }

    private static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                start = mid+1;
            }
            if(target < arr[mid]) {
                end = mid -1;
            }
            if(target == arr[mid]) {
                return target;
            }
            if(end == start || end-start== 1) {
                if(target <  arr[start]) {
                    return arr[start];
                } else {
                    return arr[end];
                }
            }
        }
        return -1;
    }


}
