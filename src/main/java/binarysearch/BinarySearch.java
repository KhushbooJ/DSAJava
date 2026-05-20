package main.java.binarysearch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {21, 76, 98, 101, 123, 144, 165, 342, 566,3354};
        int index = binarySearchh(arr, 0, arr.length - 1, 222);
        if (index == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + index);
    }


    static int binarySearchh(int[] arr, int low, int high, int num) {
        if (high >= low) {
            int mid = (high+low)/ 2;
            if (arr[mid] == num)
                return mid;

            if (arr[mid] > num)
                return binarySearchh(arr, low, mid - 1, num);

            return binarySearchh(arr, mid + 1, high, num);
            }
        return -1;
    }
}
