/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int left = 0,right = 0;

        int count = 0;
        while(right<nums.length){
            if(nums[right] == 0){
                right++;

                count = right - left - 1;
                max = max >= count ? max : count;

                left = right;
            }else{
                right++;
            }

        }

        //处理数组最后一个为1的情况，同时这个处理不会影响nums[length-1]=0时的结果；
        //nums[length-1]=0时，会在if中处理，然后left=right，到了此处，count=0，已经到了最小，不会影响已经得到的max。
        count = right - left;
        max = max >= count ? max : count;
        
        return max;
    }
}
// @lc code=end

