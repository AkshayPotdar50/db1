package com.atos.deproj.sprint2145.design.sprint5;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {
    /*Sort an array of strings alphabetically in ascending order.*/


    public static void main(String[] args) {
        String[] arr1={"akshay", "ashish", "swapnil","aaksah"};


        //alphabetical ascending
        String[] alphabetical= Arrays.stream(arr1).sorted().toArray(String[]::new);

        String[] alphadesc=Arrays.stream(arr1).sorted(Comparator.reverseOrder()).toArray(String[]::new);

        String[] byLegth=Arrays.stream(arr1).sorted(Comparator.comparingInt(String::length)).toArray(String[]::new);

        String[] byLegthDesc=Arrays.stream(arr1).sorted(Comparator.comparingInt(String::length).reversed()).toArray(String[]::new);

        //by number of vowels



    }

    private static int countVowel(String str){
        return (int)str.chars().filter(c->"aeiouAEIOU".indexOf(c) !=-1).count();
    }
}
