package com.atos.deproj.sprint2145.design.sprint4;

import java.util.stream.IntStream;

public class PrimeAndComposite {

    public static boolean isPrime(int number){
        if(number <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(number)).noneMatch(i->number %i ==0);

    }
}
