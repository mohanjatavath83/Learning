package com.learning.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class PrintEvenOdd {

    int max = 20;
    int counter = 1;


    public void printEven()
    {

        synchronized (this)
        {
            while (counter<=max)
            {

                if(counter%2==0)
                {
                    try {
                        wait();
                    }catch (Exception ex)
                    {

                    }
                }

                System.out.println(counter);
                counter++;
                notify();
            }

        }

    }

    public  void printOdd()
    {

        synchronized (this)
        {
            while (counter<=max)
            {
                while (counter<=max)
                {

                    if(counter%2!=0)
                    {
                        try {
                            wait();
                        }catch (Exception ex)
                        {

                        }
                    }

                    System.out.println(counter);
                    counter++;

                    notify();
                }
            }
        }

    }

    public static void main(String[] args) {

        PrintEvenOdd printEvenOdd = new PrintEvenOdd();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOdd.printEven();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printEvenOdd.printOdd();
            }
        });

        thread1.start();
        thread2.start();



    }


}
