package main.java.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        //filter string with length >= 4 and upper case
        String test = "This is a test string with java streams";
        List<String> stream = Arrays.stream(test.split(" "))
                .filter((String s) -> s.length() <= 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(stream);


        //filter and count elements that are even in array
        List<Integer> list = Arrays.asList(23,44,6,0,-22,3,46,77);
        System.out.println(list.stream().filter((Integer i) -> i%2 == 0)
                        .map((Integer i) -> i/2)
                .toList());
    }
}

