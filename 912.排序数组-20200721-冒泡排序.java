/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            boolean flag = true;
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                    flag = false;
                }
            }

            if(flag){
                break;
            }
        }

        return nums;
    }

    protected void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
// @lc code=end

