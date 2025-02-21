package com.atos.deproj.sprint2145.design.sprint3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayProb12 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Union using Streams
        Set<Integer> union = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .boxed()
                .collect(Collectors.toSet());

        // Intersection using Streams
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> intersection = Arrays.stream(arr2)
                .boxed()
                .filter(set1::contains)
                .collect(Collectors.toSet());

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    public static Set<Integer> findUnion(int[] arr1, int[] arr2){
Set<Integer> unionSet=new HashSet<>();
for(int num : arr1) unionSet.add(num);
for(int num: arr2) unionSet.add(num);
return unionSet;
    }

    public static Set<Integer> findIntersection(int[] arr1, int[] arr2){
        Set<Integer> set1= Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> intersection=Arrays.stream(arr2).boxed().filter(set1::contains).collect(Collectors.toSet());
        return intersection;
    }

    /*
    *
    *
    *
    *
    *
    *
    * SELECT department_id, AVG(salary) AS average_salary
FROM employees
GROUP BY department_id;
*/
}
