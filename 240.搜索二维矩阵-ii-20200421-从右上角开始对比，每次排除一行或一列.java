/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0){
            return false;
        }

        int row=0,col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if (matrix[row][col]>target){
                //排除当前列
                col--;
            }else{
                //排除当前行
                row++;
            }
        }

        return false;
    }
}
// @lc code=end

