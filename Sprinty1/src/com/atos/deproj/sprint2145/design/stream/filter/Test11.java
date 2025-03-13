package com.atos.deproj.sprint2145.design.stream.filter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test11 {
    public static void main(String[] args) {

        /*1.Filtering Out Null or Empty Values*/
        List<String> names = Arrays.asList("Alice", "", "Bob", null, "Charlie");
        List<String> validNames = names.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty())
                .toList();



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();




        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 30),
                new Employee("Charlie", 35)
        );

        List<Employee> seniorEmployees = employees.stream()
                .filter(emp -> emp.age > 30)
                .toList();




        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);
        List<Integer> uniqueNumbers = numbers2.stream()
                .distinct()
                .toList();




        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape");
        List<String> aWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .toList();





        List<String> logs = Arrays.asList("INFO: Startup complete", "ERROR: Null pointer", "WARN: Deprecated API");
        List<String> errorLogs = logs.stream()
                .filter(log -> log.startsWith("ERROR"))
                .toList();




        List<Product> products = Arrays.asList(
                new Product("Milk", LocalDate.now().minusDays(1)),
                new Product("Bread", LocalDate.now().plusDays(3))
        );

        List<Product> validProducts = products.stream()
                .filter(p -> p.expiryDate.isAfter(LocalDate.now()))
                .toList();




        List<Employee> engineers = employees.stream()
                .filter(emp -> emp.getRole().equals("Engineer"))
                .toList();


    }
}

class Employee {
    String name;
    int age;
    Employee(String name, int age) { this.name = name; this.age = age; }

    public Object getRole() {
        return null;
    }
}




class Product {
    String name;
    LocalDate expiryDate;
    Product(String name, LocalDate expiryDate) { this.name = name; this.expiryDate = expiryDate; }
}






