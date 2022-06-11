package com.learning.dynamicprogramming;

class Solution {


    public boolean subsetSumDp(int[] arr, int X) {

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

        return table[arr.length][X];


    }


    public boolean canPartition(int[] nums) {

        Solution sol = new Solution();

        int sum = 0;

        for(int i =0;i<nums.length;i++)
            sum =sum+nums[i];


        if(sum%2!=0)
        {
            return false;
        }
        else
        {
            return sol.subsetSumDp(nums,sum/2);
        }

    }
}


public class EqualPartition {
}
