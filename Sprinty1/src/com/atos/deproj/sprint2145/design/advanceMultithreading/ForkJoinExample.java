package com.atos.deproj.sprint2145.design.advanceMultithreading;

import java.util.concurrent.*;

public class ForkJoinExample extends RecursiveTask<Integer> {
    private final int number;

    public ForkJoinExample(int number) {
        this.number = number;
    }

    @Override
    protected Integer compute() {
        if (number <= 1) return number;

        ForkJoinExample task1 = new ForkJoinExample(number - 1);
        ForkJoinExample task2 = new ForkJoinExample(number - 2);

        task1.fork(); // Asynchronously execute first task
        int result2 = task2.compute(); // Compute second task synchronously
        int result1 = task1.join(); // Wait for first task to finish

        return result1 + result2;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(new ForkJoinExample(10)); // Compute Fibonacci(10)
        System.out.println("Fibonacci(10) = " + result);
    }
}

