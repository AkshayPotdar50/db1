package com.atos.deproj.sprint2145.design.stream.sys1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatInList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 2, 3, 4, 3, 5, 2, 2, 2, 2);

        int mostRepeat= numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(()->new RuntimeException("no most frequent element"));

        Map<Boolean,List<Integer>> partitioned=numbers.stream()
                .collect(Collectors.partitioningBy(n-> n%2 ==0));

        System.out.println("even"+partitioned.get(true));


        List<String> words = Arrays.asList(
                "apple", "banana", "cherry", "date", "elderberry", "fig", "grape",
                "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange",
                "papaya", "quince", "raspberry", "strawberry", "tangerine", "ugli",
                "vanilla", "watermelon", "xigua", "yam", "zucchini", "apricot",
                "blackberry", "blueberry", "cantaloupe", "dragonfruit", "gooseberry",
                "grapefruit", "jackfruit", "kumquat", "lime", "mulberry", "olive",
                "passionfruit", "pomegranate", "rhubarb", "soursop", "tomato",
                "walnut", "yellowpepper", "zebrafruit", "pineapple", "coconut",
                "plum", "peach", "pear", "persimmon", "cranberry"
        );

        List<String> result=words.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(result);
    }
}
