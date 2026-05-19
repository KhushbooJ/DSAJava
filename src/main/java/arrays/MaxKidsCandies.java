package main.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxKidsCandies {

    public static void main(String[] args) {

        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        for(int i=0;i<candies.length;i++){
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= maxCandies){
                output.add(true);
            } else {
                output.add(false);
            }
        }
        return output;
    }
}
