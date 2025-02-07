package com.atos.deproj.sprint2145.design;

import java.util.Scanner;

import java.util.Scanner;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start with a basic coffee
        Coffee coffee = new BasicCoffee();

        while (true) {
            System.out.println("\nCurrent Order: " + coffee.getDiscription() + " -> Cost: $" + coffee.getCost());
            System.out.println("Choose an add-on:");
            System.out.println("1. Add Milk (+$1.5)");
            System.out.println("2. Add Sugar (+$0.5)");
            System.out.println("3. Finish Order");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    coffee = new MilkDecorator(coffee);
                    System.out.println("Milk added!");
                    break;
                case 2:
                    coffee = new SugerDecorator(coffee);
                    System.out.println("Sugar added!");
                    break;
                case 3:
                    System.out.println("\nFinal Order: " + coffee.getDiscription() + " -> Total Cost: $" + coffee.getCost());
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

