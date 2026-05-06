package main.java.functional;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {
        Predicate<Integer> isEven = (val) -> {
            if (val%2 == 0){
                return true;
            }
            return false;
        };

        System.out.println(isEven.test(0));
    }

}
