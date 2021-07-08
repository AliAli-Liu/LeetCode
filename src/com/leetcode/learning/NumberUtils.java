package com.leetcode.learning;

import java.util.Arrays;

public class NumberUtils {
	public static void printNum(int[] nums) {
		System.out.println(Arrays.toString(nums));
    }
	
	public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
