package topics.arrays.solutions.03_merge_sorted_array;

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge nums2 into nums1 from the back
        while (i >= 0 && j >= 0) {
            // Place the larger value at the end
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy any remaining elements from nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}