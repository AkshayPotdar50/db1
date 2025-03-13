package com.atos.deproj.sprint2145.design.stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ParallelReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.parallelStream()
                .reduce(0,
                        (a, b) -> a + b,  // Accumulator
                        (a, b) -> a + b); // Combiner
        System.out.println(STR."Sum with parallel stream: \{sum}"); // Output: 21
    }
}

