/**Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 

Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
 

Constraints:

1 <= n <= 150
 */
package leetcode.Example7;

class Solution {
    public int smallestEvenMultiple(int n) {
        int multiple = n; // Start with n as the initial multiple
        
        // Keep incrementing the multiple by n until it becomes divisible by 2
        while (multiple % 2 != 0) {
            multiple += n;
        }
        
        return multiple;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int n = 1;
        int result = solution.smallestEvenMultiple(n);
        System.out.println("Smallest multiple of 2 and " + n + ": " + result);
        
        n = 10;
        result = solution.smallestEvenMultiple(n);
        System.out.println("Smallest multiple of 2 and " + n + ": " + result);
    }
}
