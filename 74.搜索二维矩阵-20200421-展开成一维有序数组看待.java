/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0){
            return false;
        }

        //matrix的行数
        int m=matrix.length;
        //matrix的列数
        int n=matrix[0].length;

        //将一个m*n的矩阵看待成一个有序数组
        int left=0,right=m*n-1;

        int center,row,col;

        while(left<=right){
            center=(left+right)/2;

            //通过数组中的位置center，反推出在矩阵中位置
            row=center/n;
            col=center%n;

            if(matrix[row][col]==target){
                return true;
            } else if (matrix[row][col]>target){
                //如果right=center，会出现死循环
                right=center-1;
            }else{
                //如果left=center，会出现死循环
                left=center+1;
            }

        }

        return false;
    }
}
// @lc code=end

