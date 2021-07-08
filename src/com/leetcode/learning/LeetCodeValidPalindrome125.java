package com.leetcode.learning;

public class LeetCodeValidPalindrome125 {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        char leftChar,rightChar;
        while(left<right) {
            leftChar = charArray[left];
            if(!isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            rightChar = charArray[right];
            if(!isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }
            int substract = leftChar - rightChar;
            if (isDigit(leftChar) || isDigit(rightChar)) {
                if (substract != 0) {
                    return false;
                }
            }
            if (substract != 0 && substract != 32 && substract != -32) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public boolean isDigit(char c) {
        return c>='0' && c<='9';
    }
    
    public boolean isLetterOrDigit(char c) {
        return isDigit(c) || (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
}
