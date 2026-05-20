package main.java.binarysearch;

public class PivotInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1};
        System.out.println(findPivotInRotatedArray(arr));
    }

    private static int findPivotInRotatedArray(int[] arr) {
        int start = 0;
        int end =arr.length-1;
        int mid;
        int pivot = -1;
        while (start<=end) {
            mid = start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]) {
                return arr[mid];
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return arr[mid-1];
            }
            if(arr[mid] < arr[start]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return pivot;
    }
}
