package main.java.strings;

import java.util.Arrays;

public class LargestPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "floor"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<=strs.length-1;i++) {
            while(strs[i].indexOf(prefix) != 0) {
                System.out.println(strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length()-1);
            }
             if(prefix.isEmpty()) {
                 return "";
             }


        }
        return prefix;
    }

}
