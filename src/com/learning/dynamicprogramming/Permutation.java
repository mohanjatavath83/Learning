package com.learning.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {


    Set<List<Integer>> set = new HashSet<>();

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public void permutation(int[] nums, int index) {

        if (index == nums.length - 1) {

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            set.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++)
        {
            swap(nums, index, i);
            permutation(nums, index + 1);
            swap(nums, index, i);
        }
    }


    public static void main(String[] args) {

        Permutation permutation = new Permutation();
        int[] nums = {1, 1, 2};
        permutation.permutation(nums, 0);
        System.out.println(permutation.set);
    }
}
