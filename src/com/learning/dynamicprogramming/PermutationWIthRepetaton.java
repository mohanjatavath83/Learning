package com.learning.dynamicprogramming;

public class PermutationWIthRepetaton {


    public void print(int n, int index, int[] arr) {

        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();

            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[index] = i;
            print(n, index + 1, arr);
        }
    }

    public void print(int n) {
        int[] arr = new int[n];
        print(n, 0, arr);
    }


    public static void main(String[] args) {

        PermutationWIthRepetaton repetaton = new PermutationWIthRepetaton();
        repetaton.print(4);
    }
}
