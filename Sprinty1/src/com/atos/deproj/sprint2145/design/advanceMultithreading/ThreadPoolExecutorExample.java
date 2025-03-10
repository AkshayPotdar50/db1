package com.atos.deproj.sprint2145.design.advanceMultithreading;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(
                2,  // Core threads
                5,  // Maximum threads
                10, TimeUnit.SECONDS,  // Keep-alive time for idle threads
                new LinkedBlockingQueue<>(10) // Task queue
        );

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
