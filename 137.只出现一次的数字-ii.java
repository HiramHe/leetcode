/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;
        
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                result ^= nums[i];
            }else{
                result &= nums[i];
            }
        }

        return result;
    }
}
// @lc code=end

