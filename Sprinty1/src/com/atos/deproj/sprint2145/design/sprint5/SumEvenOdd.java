package com.atos.deproj.sprint2145.design.sprint5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sum of Even Numbers
        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        // Sum of Odd Numbers
        int sumOdd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        // Print the results
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}
