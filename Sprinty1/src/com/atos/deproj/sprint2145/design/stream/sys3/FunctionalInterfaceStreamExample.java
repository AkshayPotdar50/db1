package com.atos.deproj.sprint2145.design.stream.sys3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class FunctionalInterfaceStreamExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ashish", 60000),
                new Employee("Rohan", 45000),
                new Employee("Neha", 75000),
                new Employee("Aditi", 30000)
        );

        //predicate
        Predicate<Employee> highSalary= emp -> emp.salary >50000;

        //function
        Function<Employee, String> getNamesInUppercase=emp-> emp.name.toUpperCase();

        //consumer
        Consumer<String> printname= System.out::println;


        //streams
        employees.stream().filter(highSalary).map(getNamesInUppercase).forEach(printname);
    }
}
