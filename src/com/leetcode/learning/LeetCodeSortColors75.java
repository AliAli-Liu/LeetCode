package com.leetcode.learning;

public class LeetCodeSortColors75 {
	public void sortColors(int[] nums) {
		int zero = -1; // [0,zero] == 0
		int two = nums.length; // [two, nums.length-1] == 2
		int cur = 0;
		while (cur < two) {
			if (nums[cur] == 1) {
				cur++;
			} else if (nums[cur] == 0) {
				zero++;
				NumberUtils.swap(nums, cur, zero);
				cur++;
			} else {
				two--;
				NumberUtils.swap(nums, cur, two);
			}
		}
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,1,2,0,1,0};
		new LeetCodeSortColors75().sortColors(nums);
		NumberUtils.printNum(nums);
	}
}
