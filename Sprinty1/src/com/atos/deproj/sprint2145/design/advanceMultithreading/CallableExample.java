package com.atos.deproj.sprint2145.design.advanceMultithreading;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            Thread.sleep(2000); // Simulate long task
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Task submitted, waiting for result...");
        Integer result = future.get(); // Blocking call
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}

