package main.java.binarysearch;

public class MountainArrayPeak2 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,3,2,0};
        int target = 3;
        int start = 0;
        int end = arr.length -1;
        if(arr.length == 3) {
            System.out.println(1);
        } else {
            int peakIndex =  mountainPeak(arr, start,end);
            int targetIndex;
            if(arr[peakIndex] == target) {
                targetIndex = peakIndex;
            } else {
               targetIndex = searchBinary(arr, 0, peakIndex -1, target,true);
            }

            if(targetIndex == -1) {
                targetIndex = searchBinary(arr,peakIndex+1,arr.length-1, target, false);
            }
            System.out.println(targetIndex);

        }

    }

    private static int searchBinary(int[] arr, int start, int end, int target, boolean isAscending) {

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(isAscending) {
                if(target > arr[mid]) {
                    start = mid+1;
                } else if (target < arr[mid]){
                    end = mid -1;
                } else {
                    return mid;
                }
            } else {
                if(target < arr[mid]) {
                   start = mid+1;
                } else if (target > arr[mid]){
                    end = mid-1;
                } else {
                    return mid;
                }
            }


        }
        return -1;
    }

    private static int mountainPeak(int[] arr, int start, int end) {

        int peakElement;
        while(start<=end) {
            int mid = start + (end - start)/2;
            peakElement = arr[mid];
            if(mid == 0) {
                return mid+1;
            } else if(mid == arr.length -1){
                return mid-1;
            } else if(peakElement > arr[mid+1] && peakElement > arr[mid-1]) {
                return mid;
            } else if(peakElement > arr[mid+1]) {
                end = mid-1;
            } else if(peakElement > arr[mid-1]) {
                start = mid+1;
            }
        }
        return -1;
    }
}
