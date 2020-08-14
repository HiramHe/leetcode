/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        //处理特殊情况
        if(nums==null || nums.length==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        //dp；到第i家时，能偷窃到的最高金额
        int[] dp = new int[nums.length];
        //dp数组初始化
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);

        //从第三家开始计算dp
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }

        //最后一个数即是一夜之间能打劫到的最高金额
        return dp[nums.length-1];
    }
}
// @lc code=end

