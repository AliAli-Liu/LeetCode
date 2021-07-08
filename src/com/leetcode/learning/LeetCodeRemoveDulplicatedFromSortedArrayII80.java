package com.leetcode.learning;

public class LeetCodeRemoveDulplicatedFromSortedArrayII80 {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int k = 0;
		int count = 1;
		for (int i=1; i<nums.length; i++) {
			if (nums[i] != nums[k] || (nums[i] == nums[k] && count++ == 1)) {
				k++;
				if (k != i) {
					nums[k] = nums[i];
				}
				if (nums[i] != nums[k]) {
					count = 1;
				}
			}
		}
		return k+1;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,3,3,4};
		System.out.println(new LeetCodeRemoveDulplicatedFromSortedArrayII80().removeDuplicates(nums));
		NumberUtils.printNum(nums);
	}
}
