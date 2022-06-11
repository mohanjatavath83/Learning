package com.learning.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadExample1 {

    public static void main(String[] args) {


        Runnable runnable = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("thread name = " + Thread.currentThread().getName() + " current value i = " + i);
            }
        };


        Thread t1 = new Thread(runnable);
        t1.setDaemon(true);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
    }
}
