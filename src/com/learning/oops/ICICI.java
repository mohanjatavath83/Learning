package com.learning.oops;

public class ICICI implements Atm{


    public double withDraw(double amount) {
        System.out.println("ICICI Amount debited from account XXX56 Rs." + amount);

        return amount;
    }

    public void deposit(double amount) {
        System.out.println("ICICI Amount credited from account XXX56 Rs." + amount);
    }
}
