package topics.arrays.solutions.04_plus_one;

import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit and process carry
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just add one and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise, set current digit to 0 and continue
            digits[i] = 0;
        }
        // If all digits were 9, create a new array with extra space
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}