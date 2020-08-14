/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
    
        for(int i=1;i<nums.length;i++){
            int key = nums[i];
            int j = i-1;
            for(;j>=0;j--){
                if(key < nums[j]){
                    nums[j+1] = nums[j];
                }else{
                    break;
                }
            }

            nums[j+1] = key;
        }

        return nums;
    }
}
// @lc code=end

