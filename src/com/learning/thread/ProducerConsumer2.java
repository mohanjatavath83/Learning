package com.learning.thread;


class SharedObject {
    int currentCount = 0;
    int max = 20;


}

class printEvenOdd1 {

    SharedObject sharedObject = new SharedObject();

    public void printOdd() {
        synchronized (this) {
            while (sharedObject.currentCount < sharedObject.max) {
                while (sharedObject.currentCount % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {

                    }
                }
                System.out.print("odd");
                System.out.println(sharedObject.currentCount++);
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (sharedObject.currentCount < sharedObject.max) {
                while (sharedObject.currentCount % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {

                    }
                }

                System.out.print("even");
                System.out.println(sharedObject.currentCount++);
                notify();
            }
        }
    }
}

public class ProducerConsumer2 {


    public static void main(String[] args) {

        printEvenOdd1 printEvenOdd = new printEvenOdd1();
        new Thread(() -> printEvenOdd.printOdd()).start();
        new Thread(() -> printEvenOdd.printEven()).start();

    }
}
