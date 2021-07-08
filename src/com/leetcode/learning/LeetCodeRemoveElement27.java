package com.leetcode.learning;

public class LeetCodeRemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i<nums.length; i++) {
			if (nums[i] != val) {
				if (i != k) {					
//					swap(nums, i, k);
					nums[k] = nums[i];
				}
				k++;
			}
		}
        return k;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void printNum(int[] nums) {
    	for (int i=0;i<nums.length; i++) {
    		System.out.println(nums[i]);
    	}
    }
    
    public static void main(String[] args) {
		int[] nums = new int[] {2,3,3,2};
		printNum(nums);
		int val = 3;
		int remainElementSize = new LeetCodeRemoveElement27().removeElement(nums, val);
		System.out.println(remainElementSize);
		printNum(nums);
	}
}
