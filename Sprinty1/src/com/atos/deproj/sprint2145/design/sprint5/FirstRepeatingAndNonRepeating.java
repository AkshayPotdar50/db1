package com.atos.deproj.sprint2145.design.sprint5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingAndNonRepeating {
    public static void main(String[] args) {
        String input = "swiss";

        // Find first repeating character
        Character firstRepeating = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        // Find first non-repeating character
        Character firstNonRepeating = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First Repeating Character: " + firstRepeating);
        System.out.println("First Non-Repeating Character: " + firstNonRepeating);
    }


    // Function to find the first repeating character
    public static Character findFirstRepeating(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                return c; // First repeating character found
            }
            charCount.put(c, 1);
        }
        return null; // No repeating character found
    }

    // Function to find the first non-repeating character
    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}

