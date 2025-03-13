package com.atos.deproj.sprint2145.design.stream.sys1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestWordFinder {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "watermelon", "blueberry", "kiwi");

        Optional<String> longest=words.stream().max(Comparator.comparingInt(String::length));

        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange", "grape", "grape");



        // Count occurrences of each word
        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Word occurrences: " + wordCount);



    }
}
