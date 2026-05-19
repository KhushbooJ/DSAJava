package main.java.binarysearch;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] chars = new char[]{'c','f','j'};
        System.out.println(smallestGreaterThanTarget(chars,'j'));
    }

    private static char smallestGreaterThanTarget(char[] chars, char c) {
        int target = c;
        int start = 0;
        int end = chars.length -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target > chars[mid]) {
                start = mid+1;
            }
            if(target < chars[mid]){
                end = mid-1;
            }
            if(start == end) {
                return chars[start];
            }
            if(start-end ==1) {
                if(target > chars[start]) {
                    return chars[start];
                } else if(target == chars[start]) {
                    return Character.MIN_VALUE;
                } else
                    return chars[end];
                }
            }
        return Character.MIN_VALUE;
    }
    }

