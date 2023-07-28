/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 Example 1:

 Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
package leetcode.Example11;

 class Solution {
    
    public static void rotate(int[][] matrix){
        
        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
            
        }

        for (int i = 0; i < n; i++) {
            
            for (int j = i + 1; j < n / 2; j++) {
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                
             System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
