package com.atos.deproj.sprint2145.design.stream.sys2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SafeResource {
    String name;
    public SafeResource(String name) {
        this.name = name;
    }
}

public class DeadlockResolved {
    public static void main(String[] args) {
        SafeResource resource1 = new SafeResource("Resource 1");
        SafeResource resource2 = new SafeResource("Resource 2");

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            while (true) {
                if (lock1.tryLock()) {
                    try {
                        if (lock2.tryLock()) {
                            try {
                                System.out.println("Thread 1: Locked both resources safely");
                                break;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (lock1.tryLock()) { // Always lock in same order
                    try {
                        if (lock2.tryLock()) {
                            try {
                                System.out.println("Thread 2: Locked both resources safely");
                                break;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}

