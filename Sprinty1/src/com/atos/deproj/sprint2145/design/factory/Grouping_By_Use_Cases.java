package com.atos.deproj.sprint2145.design.factory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping_By_Use_Cases {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dan", "Eve");

        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
// Output: {3=[Bob, Dan, Eve], 5=[Alice], 7=[Charlie]}



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> evenOddGroups = numbers.stream()
                .collect(Collectors.groupingBy(n -> (n % 2 == 0) ? "Even" : "Odd"));

        System.out.println(evenOddGroups);
// Output: {Odd=[1, 3, 5, 7, 9], Even=[2, 4, 6, 8, 10]}



        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
// Output: {apple=3, banana=2, cherry=1}





    }
}
