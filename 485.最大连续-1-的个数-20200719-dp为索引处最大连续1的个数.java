import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        //dp[i]：位置i处最大连续1的个数
        //由于要处理nums[0]时的情况，即dp[0]需要使用到dp[-1]，但下标不能为负数，于是将nums[0]时的dp放在dp[1]中，后续依次放即可。
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, 0);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                dp[i+1] = dp[i] + 1;
            }
        }

        int max = dp[0];
        for(int j=1;j<dp.length;j++){
            if(max <= dp[j]){
                max = dp[j];
            }
        }

        return max;
    }
}
// @lc code=end

