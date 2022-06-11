package com.learning.basics;

import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {


        Arrays.sort(nums);
        int index = (nums.length -1)/ 2 ;
        //System.out.println("index = " + index);

        for (int i = 0; i < nums.length; i++) {
          //  System.out.println(nums[i]);

            if (i + index <= nums.length - 1) {
                if (nums[i] == nums[i + index]) {
                    return nums[i];
                }
            }
        }


        return -1;

    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
}
