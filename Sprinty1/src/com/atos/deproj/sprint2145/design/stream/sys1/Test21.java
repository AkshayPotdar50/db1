package com.atos.deproj.sprint2145.design.stream.sys1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test21 {
    public static void main(String[] args) {


        List<Employee> list1 = Arrays.asList(
                new Employee("akshay", 27, "developement"),
                new Employee("ashish", 25, "testing"),
                new Employee("swapnil", 31, "deployment")
        );

        //group employee by department and count them

        Map<String, Long> departmentCount = list1.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(departmentCount);
    }


}

class Employee{
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
