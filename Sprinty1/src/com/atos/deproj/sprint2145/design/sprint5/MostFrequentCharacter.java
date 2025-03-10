package com.atos.deproj.sprint2145.design.sprint5;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input="swiss";

        char mostFrequentChar=input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
