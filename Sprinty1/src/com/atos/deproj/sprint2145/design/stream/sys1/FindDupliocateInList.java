package com.atos.deproj.sprint2145.design.stream.sys1;

import java.util.*;
import java.util.stream.Collectors;

public class FindDupliocateInList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 9, 1, 10, 5, 5);

        Set<Integer> seen= new HashSet<>();
        Set<Integer> duplicates=numbers.stream().filter(n-> !seen.add(n)).collect(Collectors.toSet());




        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50, 50, 40, 30, 20);

        // Find the second-highest unique number
        Optional<Integer> secondHighest = numbers2.stream()
                .distinct()                         // Remove duplicates
                .sorted(Comparator.reverseOrder())  // Sort in descending order
                .skip(1)                            // Skip the first (highest) number
                .findFirst();                       // Get the second-highest

        System.out.println("Second highest number: " + secondHighest.orElse(null));


    }
}
