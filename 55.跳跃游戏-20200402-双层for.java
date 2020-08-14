import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length<=1)return true;
        
        boolean[] dp=new boolean[nums.length];
        Arrays.fill(dp,false);

        dp[0]=true;
        for(int i=1;i<nums.length;i++){
            //贪心
            for(int step=nums[i-1];step>=0;step--){
                
                if(dp[i-1]&&step>0){
                    //防止越界
                    if(i-1+step>=nums.length){
                        continue;
                    }

                    //动态规划
                    dp[i-1+step]=true;
                }
                
            }
        }

        return dp[nums.length-1];

    }

}
// @lc code=end

