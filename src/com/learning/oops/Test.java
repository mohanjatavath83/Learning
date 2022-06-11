package com.learning.oops;

class Bike {
    void run() {
        System.out.println("running");
    }

}


class Splendor extends Bike {


    @Override
    void run() {
        System.out.println("running safely with 60km");
    }

    void runSpeed() {

        System.out.println("run speed");

    }

}


public class Test {
    public static void main(String args[]) {
        Bike b = new Splendor();
        b.run();

    }
}