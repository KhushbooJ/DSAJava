package main.java.puzzles;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class SubsetArray {

    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 21};

        Arrays.sort(a);
        Arrays.sort(b);

        HashSet<Integer> aset = new HashSet<>();

        for(int key:a) {
            aset.add(key);
        }

        boolean subset = true;

        for(int i=0;i< b.length;i++){
            if(!aset.contains(b[i])) {
                System.out.println("Not a subset");
                subset = false;
                break;
            }
        }

        if(subset)
            System.out.println("is a subset");
    }
}
