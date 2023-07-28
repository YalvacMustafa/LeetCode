/**
 --- MEDIAN OF TWO SORTED ARRAYS---

 Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */

package leetcode.Example3;

public class Main {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int total = m + n;
        if (total % 2 == 0) {
            return (findKthElement(nums1, nums2, total / 2) + findKthElement(nums1, nums2, total / 2 - 1)) / 2.0;
        } else {
            return findKthElement(nums1, nums2, total / 2);
        }
    }
    
    private int findKthElement(int[] nums1, int[] nums2, int k) {
        int m = nums1.length, n = nums2.length;
        int i = 0, j = 0;
        while (true) {
            if (i == m) {
                return nums2[j + k];
            }
            if (j == n) {
                return nums1[i + k];
            }
            if (k == 0) {
                return Math.min(nums1[i], nums2[j]);
            }
            int half = (k + 1) / 2;
            int newIndex1 = Math.min(i + half, m) - 1;
            int newIndex2 = Math.min(j + half, n) - 1;
            int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
            if (pivot1 <= pivot2) {
                k -= (newIndex1 - i + 1);
                i = newIndex1 + 1;
            } else {
                k -= (newIndex2 - j + 1);
                j = newIndex2 + 1;
            }
        }
    }
}

