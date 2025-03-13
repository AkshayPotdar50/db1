package com.atos.deproj.sprint2145.design.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce() with an identity value
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(STR."Sum: \{sum}"); // Output: Sum: 15

        // Using reduce() without identity (returns Optional)
        Optional<Integer> sumOptional = numbers.stream().reduce((a, b) -> a + b);
        sumOptional.ifPresent(result -> System.out.println("Sum using Optional: " + result));
    }
}

