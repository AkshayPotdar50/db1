package com.atos.deproj.sprint2145.design.sprint5;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPool {
    public static void main(String[] args) {

        ThreadPoolExecutor executor=new ThreadPoolExecutor(
                2, 4, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(2),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
        );

        for(int i=1; i<=6; i++){
            int taskId=i;
            executor.execute(()->{
                System.out.println("Executing task "+taskId+" on "+Thread.currentThread().getName());
                try{Thread.sleep(3000);}catch (InterruptedException e){e.printStackTrace();}
            });
        }

        executor.shutdown();
    }
}
