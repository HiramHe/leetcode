/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }else{
                max = max >= count ? max : count;
                count = 0;
            }
        }

        //处理nums[length-1]=1时的情况
        max = max >= count ? max : count;

        return max;
    }
}
// @lc code=end

