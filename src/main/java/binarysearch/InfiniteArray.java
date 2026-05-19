package main.java.binarysearch;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,7,8,10,11,13,14,67,89,90,111,123};
        int start = 0;
        int end = 1;
        int index = -1;
        while (index == -1) {
            start = end+1;
            end = start*2 + 1;
            index = binarySearchInfinite(arr, 111,start,end);
        }

        System.out.println(index);
    }

    private static int binarySearchInfinite(int[] arr, int target, int start, int end) {
        while (start<=end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                start = mid+1;
            } else if(target < arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
