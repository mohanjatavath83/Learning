package com.learning.oops;

public class SBI implements Atm {

    public double withDraw(double amount) {
        System.out.println("SBI Amount debited from account XXX56 Rs." + amount);

        return amount;
    }

    public void deposit(double amount) {
        System.out.println("SBI Amount credited from account XXX56 Rs." + amount);
    }

}
