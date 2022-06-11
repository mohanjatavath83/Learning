package com.learning.dynamicprogramming;

public class SubSetSum {


    public boolean subsetSum(int[] arr, int sum, int index) {

        if (arr.length == 0)
            return false;
        else if (sum == 0)
            return true;
        else if (index >= arr.length)
            return false;
        else if (arr[index] > sum)
            return subsetSum(arr, sum, index + 1);
        else
            return subsetSum(arr, sum - arr[index], index + 1) || subsetSum(arr, sum, index + 1);
    }


    public void subsetSumDp(int[] arr, int X) {

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

        System.out.println("subset sum possible " + table[arr.length][X]);


    }


    public static void main(String[] args) {

        SubSetSum subSetSum = new SubSetSum();
        int arr[] = {2, 3, 5, 6, 8,10};
        //System.out.println(subSetSum.subsetSum(arr, 11, 0));

        subSetSum.subsetSumDp(arr, 10);
    }
}
