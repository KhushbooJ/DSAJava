package main.java.strings;

import java.util.Stack;

public class Parantheses {

    public static void main(String[] args) {
        System.out.println(isValidPranathesis("()[]{}"));
    }

    private static boolean isValidPranathesis(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = false;
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                stack.push(')');
            }
            if(s.charAt(i) == '[') {
                stack.push(']');
            }
            if(s.charAt(i) == '{') {
                stack.push('}');
            }
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(stack.isEmpty() || stack.pop() != s.charAt(i)) {
                    return isValid;
                }
            }
        }
        return stack.isEmpty();
    }
}
