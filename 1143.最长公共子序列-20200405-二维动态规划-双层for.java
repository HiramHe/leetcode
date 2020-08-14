import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1143 lang=java
 *
 * [1143] 最长公共子序列
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1==null||text1.length()==0||text2==null||text2.length()==0){
            return 0;
        }

        //dp[i][j]：text1[0...i]、text2[0...j]的最长公共子序列的长度
        int[][] dp=new int[text1.length()][text2.length()];
        
        //将dp[][]填充0
        for(int row=0;row<text1.length();row++){
            Arrays.fill(dp[row], 0);
        }

        if(text1.charAt(0)==text2.charAt(0)){
            dp[0][0]=1;
        }

        //初始化第一行
        for(int col=1;col<text2.length();col++){
            if(text1.charAt(0)==text2.charAt(col)){
                dp[0][col]=1;
            }else{
                dp[0][col]=Math.max(dp[0][col-1], 0);
            }
        }

        //初始化第一列
        for(int row=1;row<text1.length();row++){
            if(text1.charAt(row)==text2.charAt(0)){
                dp[row][0]=1;
            }else{
                dp[row][0]=Math.max(dp[row-1][0], 0);
            }
        }

        //计算dp
        for(int row=1;row<text1.length();row++){
            for(int col=1;col<text2.length();col++){
                if(text1.charAt(row)==text2.charAt(col)){
                    //不能是坐格、上格、左上格中的最大值，因为字符串中可能存在重复字符，
                    //手动绘制ace、abcdee的dp表，就知道，只能使用左上格的值+1；
                    dp[row][col]=dp[row-1][col-1]+1;
                }else{
                    //左格、上格，这2个方格中的最大值，
                    //不用考虑左上格，因为左上格肯定是左上格、左格、上格三者中最小的；
                    dp[row][col]=Math.max(dp[row-1][col], dp[row][col-1]);
                }
            }
        }

        //寻找dp中的最大值
        int ans=0;
        for(int row=0;row<text1.length();row++){
            for(int col=0;col<text2.length();col++){
                ans=Math.max(ans, dp[row][col]);
            }
        }

        return ans;

    }
}
// @lc code=end

