package com.atos.deproj.sprint2145.design.advanceMultithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalExample {
    private static ThreadLocal<SimpleDateFormat> dateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static void main(String[] args) {
        Runnable task = () -> {
            String formattedDate = dateFormat.get().format(new Date());
            System.out.println(Thread.currentThread().getName() + " - " + formattedDate);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}

