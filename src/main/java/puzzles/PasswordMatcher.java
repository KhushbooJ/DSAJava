package main.java.puzzles;

public class PasswordMatcher {

    public static void main(String[] args) {
        System.out.println(validatePassword("Ksd23sfefdf"));
    }

    private static String validatePassword(String s) {
        int upper=0, lower=0, special=0, num=0;
        if(s.toCharArray().length < 9) {
            return "Password too small";
        }
        for(char c: s.toCharArray()) {
            if(Character.isLowerCase(c)){
                lower++;
            } else if(Character.isUpperCase(c)){
                upper++;
            } else if(Character.isDigit(c)){
                num++;
            } else
            special++;
        }
        if(upper >0 && lower >0 && special >0 && num >0) {
            return "Password valid";
        }
        return "weak";
    }
}
