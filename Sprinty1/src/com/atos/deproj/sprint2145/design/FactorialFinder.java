package com.atos.deproj.sprint2145.design;

import java.util.stream.IntStream;

public class FactorialFinder {

    public static void main(String[] args) {
        int number=5;
        long factorial=factorial(number);
        System.out.println(factorial);
    }

    public static long factorial(int n){
        return IntStream.rangeClosed(1, n).reduce(1,(a,b)-> a * b);
    }
}
