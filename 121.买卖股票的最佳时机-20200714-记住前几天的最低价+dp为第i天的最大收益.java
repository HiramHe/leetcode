import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

        if(prices==null || prices.length<=1){
            return 0;
        }

        //dp[i]：第i天的最大收益
        int[] dp = new int[prices.length];
        Arrays.fill(dp, 0);

        //记住前几天的最低价格
        int minValue = prices[0];
        for(int i=1;i<prices.length;i++){
            minValue = Math.min(minValue,prices[i]);
            dp[i] = Math.max(dp[i-1],prices[i]-minValue);
        }

        return dp[prices.length-1];
    }
}
// @lc code=end

