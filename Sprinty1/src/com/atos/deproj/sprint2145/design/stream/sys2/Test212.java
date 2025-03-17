package com.atos.deproj.sprint2145.design.stream.sys2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test212 {
    public static void main(String[] args) {

        //thir most frequent word in the list
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple",
                "mango", "banana", "mango", "grape", "grape", "orange", "grape",
                "apple", "banana", "mango", "grape", "mango", "mango"
        );

        List<String> words2=Arrays.asList("mango", "banana", "mango", "grape", "grape", "orange", "grape",
                "apple", "banana", "mango", "grape", "mango", "mango");


        Map<String,Long> wordCount=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Map.Entry<String, Long>> sortedWords=wordCount.entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue())).toList();

        System.out.println(STR."third most frequent\{sortedWords.get(2).getKey()}");



        String result = String.join(", ", words);

        System.out.println("Comma-Separated String: " + result);


        // Sample Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Cherry", 70);
        map.put("Date", 20);
        map.put("Elderberry", 90);

        // Sort map by values in descending order
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Descending order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        // Print the sorted map
        System.out.println("Sorted Map (Descending Order): " + sortedMap);




        Set<String> set1= new HashSet<>(words);
        Set<String> intersect=words2.stream().filter(set1::contains).collect(Collectors.toSet());
        System.out.println(intersect);


        List<String> intersection=words.stream().filter(words2::contains).distinct().toList();
        System.out.println(intersection);








        //we have to generate prime numbers upto given number
        int N=10;

        List<Integer> primes=IntStream.iterate(2, i->i+1)
                .filter(Test212::isPrime)
                .limit(N)
                .boxed()
                .toList();

    }

    public static boolean isPrime(int num){
        if(num < 2) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(num)).noneMatch(i->num % i ==0);
    }
}
