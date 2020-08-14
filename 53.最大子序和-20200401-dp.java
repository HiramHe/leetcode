/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)return Integer.MAX_VALUE;
        int length=nums.length;
        if(length==1){
            return nums[0];
        }
        int[] dp=new int[length];
        dp[0]=nums[0];
        int maxNum=dp[0];
        for(int i=1;i<length;i++){
            if(dp[i-1]+nums[i]>=nums[i]){
                dp[i]=dp[i-1]+nums[i];
            }else{
                dp[i]=nums[i];
            }
            if(dp[i]>=maxNum){
                maxNum=dp[i];
            }
        }

        return maxNum;

    }
}
// @lc code=end

