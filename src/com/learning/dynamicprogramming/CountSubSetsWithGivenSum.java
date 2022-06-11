package com.learning.dynamicprogramming;

public class CountSubSetsWithGivenSum {


    public static int countSubSetsWithGivenSum(int[] arr, int X, int index) {

        if (index >= arr.length)
            return 0;
        if (X == 0)
            return 1;

        else if (arr[index] > X)
            return countSubSetsWithGivenSum(arr, X, index + 1);
        else {
            return countSubSetsWithGivenSum(arr, X, index + 1) + countSubSetsWithGivenSum(arr, X - arr[index], index + 1);
        }


    }


    public static int countSubSetsWithGivenSum(int[] arr, int X) {

        boolean[][] table = new boolean[arr.length + 1][X + 1];

        for (int n = 0; n <= arr.length; n++)
            table[n][0] = true;

        for (int x = 0; x <= X; x++)
            table[0][x] = false;

        for (int n = 1; n <= arr.length; n++) {
            for (int x = 1; x <= X; x++) {
                if (arr[n - 1] > x)
                    table[n][x] = table[n - 1][x];
                else {

                    table[n][x] = table[n - 1][x] || table[n - 1][x - arr[n - 1]];
                }
            }
        }

        int count = 0;

        for (int i = 0; i < table.length; i++) {
            if (table[i][X])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 3};


        //System.out.println(countSubSetsWithGivenSum(arr, 6));
        System.out.println(countSubSetsWithGivenSum(arr, 6, 0));

    }

}
