/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null){
            return null;
        }

        selectSort(nums);

        return nums;
    }

    private void selectSort(int[] nums){

        int length = nums.length;

        for(int i=0;i<length;i++){
            int curMin = i;
            //找到每一轮的最小值
            for(int j=i;j<length;j++){
                if(nums[j]<=nums[curMin]){
                    curMin = j;
                }
            }
            //将当前最小值放到该轮数组的首位
            swap(nums, i, curMin);
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

