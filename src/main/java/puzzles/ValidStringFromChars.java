package main.java.puzzles;

import java.util.Stack;

public class ValidStringFromChars {

    public static void main(String[] args) {
        String note = "ababa";
        StringBuilder magazine = new StringBuilder("bbaahtt");
        boolean contains = true;

        for (int i=0;i<note.length();i++){
            System.out.println("char  "+note.charAt(i));
            System.out.println("magazine  "+magazine);
            if(!magazine.toString().contains(String.valueOf(note.charAt(i)))){
                contains = false;
                break;
            } else {
                int index = magazine.toString().indexOf(note.charAt(i));
                magazine.deleteCharAt(index);
            }
        }

        System.out.println(contains);

    }}
