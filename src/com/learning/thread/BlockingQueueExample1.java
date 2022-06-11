package com.learning.thread;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

class CheckCapacity implements Runnable {
    private ArrayBlockingQueue<Object> queue;

    public CheckCapacity(ArrayBlockingQueue queue) {
        this.queue = queue;
    }


    public void run() {

        while (true) {
            System.out.println("#########################################################");
            System.out.println("current size of queue = " + queue.size());
            System.out.println("#########################################################");
        }
    }


}

class Producer implements Runnable {
    private ArrayBlockingQueue<Object> queue;

    public Producer(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {

        while (true) {
            try {
                Integer integer = getInteger();
                queue.put(integer);
                System.out.println("Thread Name = " + Thread.currentThread().getName() + "integer pushed to queue = " + integer);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }


    private Integer getInteger() {
        Integer integer = new Random().nextInt();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


        return integer;
    }


}


class Consumer implements Runnable {
    private ArrayBlockingQueue<Object> queue;

    public Consumer(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {

        while (true) {
            try {
                Object integer = queue.take();
                System.out.println("Thread Name = " + Thread.currentThread().getName() + "integer received from queue = " + integer);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }


}

public class BlockingQueueExample1 {

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue(5);

        new Thread(new CheckCapacity(queue)).start();

        for (int i = 0; i < 5; i++) {
            new Thread(new Producer(queue)).start();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(new Consumer(queue)).start();
        }



    }
}
