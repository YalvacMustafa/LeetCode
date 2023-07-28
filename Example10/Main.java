package leetcode.Example10;

 class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int num1 = 12;
        int num2 = 5;
        int result1 = solution.sum(num1, num2);
        System.out.println("Input: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Output: " + result1);

        num1 = -10;
        num2 = 4;
        int result2 = solution.sum(num1, num2);
        System.out.println("Input: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Output: " + result2);
    }
}

