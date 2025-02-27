package com.atos.deproj.sprint2145.design.factory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors_use_cases {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);  // Output: Alice, Bob, Charlie



        List<Integer> ids = Arrays.asList(101, 102, 103);
        String sqlQuery = "SELECT * FROM users WHERE id IN (" +
                ids.stream().map(String::valueOf).collect(Collectors.joining(", ")) + ")";

        System.out.println(sqlQuery);
// Output: SELECT * FROM users WHERE id IN (101, 102, 103)



        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");
        String htmlList = "<ul>" +
                items.stream().collect(Collectors.joining("</li><li>", "<li>", "</li>")) +
                "</ul>";

        System.out.println(htmlList);
// Output: <ul><li>Apple</li><li>Banana</li><li>Cherry</li></ul>



        List<String> logEntries = Arrays.asList("ERROR", "WARN", "INFO");
        String logOutput = logEntries.stream()
                .collect(Collectors.joining(" | "));

        System.out.println(logOutput);  // Output: ERROR | WARN | INFO





        class Person {
            String firstName, lastName;
            Person(String firstName, String lastName) { this.firstName = firstName; this.lastName = lastName; }
        }

        List<Person> people = Arrays.asList(new Person("John", "Doe"), new Person("Jane", "Smith"));
        String fullNames = people.stream()
                .map(p -> p.firstName + " " + p.lastName)
                .collect(Collectors.joining(", "));

        System.out.println(fullNames);  // Output: John Doe, Jane Smith





        Map<String, Long> wordCount = Stream.of("apple", "banana", "apple", "cherry", "banana", "apple")
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        String frequencyReport = wordCount.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining(", "));

        System.out.println(frequencyReport);
// Output: apple: 3, banana: 2, cherry: 1





        List<String> files = Arrays.asList("report.pdf", "image.png", "data.csv", "presentation.ppt");
        String extensions = files.stream()
                .map(f -> f.substring(f.lastIndexOf('.') + 1))
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(extensions);  // Output: pdf, png, csv, ppt






    }
}
