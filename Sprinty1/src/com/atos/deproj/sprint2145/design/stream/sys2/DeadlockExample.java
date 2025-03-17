package com.atos.deproj.sprint2145.design.stream.sys2;

class Resource {
    String name;
    public Resource(String name) {
        this.name = name;
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked " + resource1.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource2) { // Waiting for resource2
                    System.out.println("Thread 1: Locked " + resource2.name);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked " + resource2.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource1) { // Waiting for resource1
                    System.out.println("Thread 2: Locked " + resource1.name);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

