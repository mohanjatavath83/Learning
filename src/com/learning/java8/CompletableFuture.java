package com.learning.java8;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFuture {


    public static void main(String[] args) throws Exception {


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future> futures = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            Future<Integer> future = executorService.submit(new Task());
            futures.add(future);

        }
        System.out.println("main method 1");
        for (Future future : futures) {
            System.out.println(future.get());
        }

        System.out.println("main thread 2");


    }


    static class Task implements Callable<Integer> {


        @Override
        public Integer call() throws Exception {

            Thread.sleep(3000);
            return new Random().nextInt();
        }


    }
}
