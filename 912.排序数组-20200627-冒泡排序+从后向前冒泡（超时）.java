import java.math.RoundingMode;

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

    //从后向前冒泡
    private void bubbleSort(int[] nums){

        //轮次
        int length = nums.length;
        for(int round=1;round<=length-1;round++){
            //标志，如果一轮比较中，没有发生交换，说明已经有序，不要再继续排序了
            boolean flag = true;
            //每轮
            for(int i=length-1;i>=round;i--){
                if(nums[i]<nums[i-1]){
                    swap(nums,i,i-1);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

