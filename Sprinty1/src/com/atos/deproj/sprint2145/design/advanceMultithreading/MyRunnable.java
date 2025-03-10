import java.util.concurrent.*;

public static class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 42; // Simulating computation
    }
}

public static void main(String[] args) throws Exception {
    ExecutorService executor = Executors.newFixedThreadPool(1);
    Future<Integer> future = executor.submit(new MyCallable());

    System.out.println("Result: " + future.get()); // Blocking call
    executor.shutdown();
}

