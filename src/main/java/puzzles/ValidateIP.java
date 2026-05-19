package main.java.puzzles;

public class ValidateIP {

    public static void main(String[] args){
        String s = "dfbf";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        String[] arr = s.trim().split("[.]");

        if(arr.length == 4){
            for (String a:arr) {
                int num;
                try {
                    num = Integer.parseInt(a);
                } catch (Exception e) {
                    System.out.println("Not a number");
                    return false;
                }
                if(!(num >= 0 && num<=255)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
