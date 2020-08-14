/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index_min = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[index_min]){
                    index_min = j;
                }
            }

            if(index_min != i){
                swap(nums,i,index_min);
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

