import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长上升子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }

        //dp[i]:以nums[i]结尾的最长子序列的长度
        Integer[] dp=new Integer[nums.length];
        Arrays.fill(dp, 1);
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int ans=dp[0];
        for(int k=1;k<dp.length;k++){
            ans=Math.max(ans, dp[k]);
        }

        return ans;
    }
}
// @lc code=end

