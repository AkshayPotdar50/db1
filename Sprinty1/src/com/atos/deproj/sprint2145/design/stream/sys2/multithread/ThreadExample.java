package com.atos.deproj.sprint2145.design.stream.sys2.multithread;

class MyThread extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
}



class Myrunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable thread running..");
    }
}


public class ThreadExample {

    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();

        Thread t2= new Thread(new Myrunnable());
        t2.start();
    }


}
