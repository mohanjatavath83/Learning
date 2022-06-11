package com.learning.dynamicprogramming;

public class HouseRobbery {


    public static int max(int[] arr, int index, int[] dp) {


       // System.out.println(index);

        if (arr.length == 0)
            return 0;
        else if (dp[index] != 0)
            return dp[index];
        else if (arr.length == 1 || arr.length - 1 == index)
            return arr[index];
        else if (arr.length == 2 || arr.length - 2 == index)
            return arr[index] > arr[index + 1] ? arr[index] : arr[index + 1];
        else {

            int inclResult = arr[index] + max(arr, index + 2, dp);
            int exclResult = max(arr, index + 1, dp);

            dp[index] = inclResult > exclResult ? inclResult : exclResult;

            return dp[index];
        }
    }

    public static int max1(int[] arr, int index, int[] dp) {


        // System.out.println(index);

        if (arr.length == 0)
            return 0;
        else if (dp[index] != 0)
            return dp[index];
        else if (arr.length == 1 || arr.length - 1 == index)
            return arr[index];
        else if (arr.length == 2 || arr.length - 2 == index)
            return arr[index] > arr[index + 1] ? arr[index] : arr[index + 1];
        else {

            int inclResult = arr[index] + max1(arr, index + 2, dp);
            int exclResult = max1(arr, index + 1, dp);

            dp[index] = inclResult > exclResult ? inclResult : exclResult;

            return dp[index];
        }
    }


    public static void main(String[] args) {


        //int[] nums = {1, 2, 3, 1};
        int[] nums = {9,2,1,5,3,11,1,2};

        // int[] nums = {2, 7, 9, 3, 1};
        //int[] nums = {9, 3, 2, 12, 5};
        int[] dp = new int[nums.length];



        System.out.println(max(nums, 0, dp));
    }
}
