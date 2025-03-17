package com.atos.deproj.sprint2145.design.stream.sys2;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadedWordCounter {
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String text = "This is a sample text. This text is for testing. Multi-threading is powerful.";


        String[] words = text.split("\\s+");
        int chunkSize = (int) Math.ceil((double) words.length / NUM_THREADS);

        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<Map<String, Integer>>> futures = new ArrayList<>();


        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, words.length);
            if (start >= end) break;

            String[] chunk = Arrays.copyOfRange(words, start, end);
            futures.add(executor.submit(new WordCountTask(chunk)));
        }

        // Merge results from all threads
        Map<String, AtomicInteger> finalWordCount = new ConcurrentHashMap<>();
        for (Future<Map<String, Integer>> future : futures) {
            Map<String, Integer> wordCount = future.get();
            wordCount.forEach((word, count) ->
                    finalWordCount.computeIfAbsent(word, k -> new AtomicInteger(0)).addAndGet(count));
        }

        executor.shutdown();


        finalWordCount.forEach((word, count) ->
                System.out.println(word + " -> " + count));
    }
}


class WordCountTask implements Callable<Map<String, Integer>> {
    private final String[] words;

    public WordCountTask(String[] words) {
        this.words = words;
    }

    @Override
    public Map<String, Integer> call() {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Clean up word
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
}

