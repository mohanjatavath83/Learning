package com.learning.thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumer {


    public Integer getItem() {
        Integer integer = new Random().nextInt();
        System.out.println("get Item " + integer);
        return integer;
    }

    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue(10);

        Runnable producer = () -> {
            while (true) {
                try {
                    queue.put(producerConsumer.getItem());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();


        Runnable consumer = () -> {

            while (true) {
                try {
                    Integer integer = queue.take();
                    System.out.println("taking item = " + integer);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(consumer).start();
    }
}
