/**
 ---TWO SUM---

 
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
package leetcode.Example2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 7, 9};
        int target = 10;
        Main main = new Main();
        int[] result = main.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
/**
 EXPLANATION
The idea is to use a hash map to store the elements and their indices.
We iterate through the array and check if the complement of the current element 
(i.e., the difference between the target and the current element) is already in the hash map. 
If it is, we have found the two numbers that add up to the target and we return their indices. 
If it is not, we add the current element and its index to the hash map. 
If we iterate through the entire array without finding a solution, 
we throw an exception since the problem guarantees that there is exactly one valid answer.
 */
