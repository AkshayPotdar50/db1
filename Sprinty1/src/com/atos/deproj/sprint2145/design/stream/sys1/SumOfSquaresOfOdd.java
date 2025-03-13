package com.atos.deproj.sprint2145.design.stream.sys1;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfOdd {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquares=numbers.stream().filter(i->i%2 !=0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println(sumOfSquares);

    }
}
