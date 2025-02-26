package com.atos.deproj.sprint2145.design.clonningTypes;

class Person implements Cloneable {
    String name;
    Address address;  // Reference to another object

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "'}";
    }
}

public class Main1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person p1 = new Person("Alice", address);
        Person p2 = (Person) p1.clone(); // Shallow copy

        p2.name = "Bobby";
        p2.address.city = "Los Angeles";  // Modifies the original object

        System.out.println(p1); // Affected due to shallow copy
        System.out.println(p2);
    }
}


