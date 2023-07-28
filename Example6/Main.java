/**Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character. */
package leetcode.Example6;

import java.util.Arrays;

class Solution {
    public char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
        
        return s;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] reversed1 = solution.reverseString(s1);
        System.out.println("Reversed string: " + Arrays.toString(reversed1));

        // Test case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] reversed2 = solution.reverseString(s2);
        System.out.println("Reversed string: " + Arrays.toString(reversed2));
    }
}
