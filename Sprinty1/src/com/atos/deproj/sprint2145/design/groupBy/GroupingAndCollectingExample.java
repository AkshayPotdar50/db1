package com.atos.deproj.sprint2145.design.groupBy;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingAndCollectingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 30),
                new Person("Eve", 25)
        );

        // Grouping by Age and Collecting Names into a List
        Map<Integer, List<String>> peopleByAgeNames = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));

        // Printing the result
        peopleByAgeNames.forEach((age, names) -> {
            System.out.println("Age " + age + ": " + names);
        });
    }
}

