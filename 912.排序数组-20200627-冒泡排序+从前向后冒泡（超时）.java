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

        bubbleSort(nums);

        return nums;
    }

	//从前向后冒泡
    private void bubbleSort(int[] nums){

        //轮次
        for(int round=1;round<=nums.length-1;round++){
            //标志，如果一轮比较中，没有发生交换，说明已经有序，不要再继续排序了
            boolean flag = true;
            //每轮
            for(int i=1;i<=nums.length-round;i++){
                if(nums[i-1]>nums[i]){
                    swap(nums,i-1,i);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
// @lc code=end

