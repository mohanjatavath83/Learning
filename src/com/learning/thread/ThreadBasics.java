package com.learning.thread;


class PrintOneToTen extends Thread {
    @Override
    public void run()
    {

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
        }
    }
}


class PrintElevenToTwenty extends Thread
{
    @Override
    public void run()
    {

        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
        }

    }
}


class PrintTwentyOneToThirty implements Runnable {
    @Override
    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
        }

    }
}


public class ThreadBasics {

    public static void main(String[] args) {


        PrintOneToTen printOneToTen = new PrintOneToTen();
        printOneToTen.start();

        PrintElevenToTwenty printElevenToTwenty = new PrintElevenToTwenty();
        printElevenToTwenty.start();

        Runnable printTwentyOneToThirty = new PrintTwentyOneToThirty();
        Thread thread = new Thread(printTwentyOneToThirty);
        thread.start();

    }
}
