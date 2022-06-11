package com.learning.thread;


import java.util.concurrent.Executors;

public class ExecutorService {


    public static void main(String[] args) {


        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("task1");
            }
        };


        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("task2");
            }
        };


        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("task3");
            }
        };


        java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);




    }
}
