package com.atos.deproj.sprint2145.design.sprint3;

import java.util.concurrent.*;

public class CallableFutureExample {
    static class SumOfSquaresTask implements Callable<Integer> {
        private final int start;
        private final int end;

        public SumOfSquaresTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i * i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Sum squares from 1 to n
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Splitting the range for two threads
        Future<Integer> future1 = executor.submit(new SumOfSquaresTask(1, n / 2));
        Future<Integer> future2 = executor.submit(new SumOfSquaresTask((n / 2) + 1, n));

        try {
            // Getting the results from both threads
            int totalSum = future1.get() + future2.get();
            System.out.println("Sum of squares from 1 to " + n + " is: " + totalSum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

