/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, 0);
        
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                dp[i+1] = dp[i] + 1;
            }
            max = max >= dp[i+1] ? max : dp[i+1];
        }

        return max;
    }
}
// @lc code=end

