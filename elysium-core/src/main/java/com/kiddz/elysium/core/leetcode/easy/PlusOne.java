package com.kiddz.elysium.core.leetcode.easy;

import java.util.Arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element
 * in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * Example 3:
 * Input: digits = [0]
 * Output: [1]
 *
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        for (int i = 0; i < newDigits.length; i++) {
            if (i == 0) {
                newDigits[i] = 1;
            } else {
                newDigits[i] = 0;
            }
        }
        return newDigits;
    }
}
