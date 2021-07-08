package com.leetcode.learning;

public class LeetCodeRemoveDulplicatedFromSortedArray26 {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int k = 0;
		for (int i=1; i<nums.length; i++) {
			if (nums[i] != nums[k]) {
				k++;
				if (k != i) {
					nums[k] = nums[i];
				}
			}
		}
		return k+1;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {};
		System.out.println(new LeetCodeRemoveDulplicatedFromSortedArray26().removeDuplicates(nums));
		NumberUtils.printNum(nums);
	}
}
