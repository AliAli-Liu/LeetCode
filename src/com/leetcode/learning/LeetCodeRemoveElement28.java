package com.leetcode.learning;

public class LeetCodeRemoveElement28 {
	public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int l = 0;
        int r = len - 1;
        while (l <= r) {
            if (nums[l] == val) {
                if (nums[r] != val) {
                    swap(nums, l++, r);    
                }
                r--;
            } else {
                l++;
            }
        }
        return l;
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {3,2,2,3};
		int val = 3;
		new LeetCodeRemoveElement28().removeElement(nums, val);
	}
}
