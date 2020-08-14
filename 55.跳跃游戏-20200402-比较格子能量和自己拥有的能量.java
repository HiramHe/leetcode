/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length<=1)return true;

        int cur=nums[0];
        int i=1;
        for(;cur!=0&&i<nums.length;i++){
            cur--;
			
			//贪心
            if(cur<=nums[i]){
                cur=nums[i];
            }
        }

        return i==nums.length;
    }
}
// @lc code=end

