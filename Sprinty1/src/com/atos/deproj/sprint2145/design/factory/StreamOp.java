package com.atos.deproj.sprint2145.design.factory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOp {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        //here we have to use filter op
        List<Integer> even=numbers.stream().filter(i->i%2 ==0).toList();
        System.out.println(even);
        /************************************************************************/

        //map operation
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> uppercaseNames=names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(uppercaseNames);
/***********************************************************************/

       List<Integer> numbers1=Arrays.asList(2, 5, 4, 6, 1, 7, 8,3, 0);
       List<Integer> sortedNum=numbers1.stream().sorted().toList();
       List<Integer> reversedSorting=numbers1.stream().sorted(Comparator.reverseOrder()).toList();



        


    }
}
