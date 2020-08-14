/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {

        //异常判断
        if(m==0 || n==0){
            return 0;
        }

        //dp[i][j]：到达(i,j)的最多路径
        int[][] dp = new int[m+1][n+1];
        
        //初始化第一行、第一列为1，下标从1开始，便于理解
        for(int k=1;k<=m;k++){
            dp[k][1]=1;
        }
        for(int p=1;p<=n;p++){
            dp[1][p]=1;
        }

        //构建dp数组
        for(int i=2;i<=m;i++){
            for(int j=2;j<=n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m][n];
    }
}
// @lc code=end

