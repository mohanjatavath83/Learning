package com.learning.basics;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any number");
        int n = scanner.nextInt();

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println(n);
    }
}
