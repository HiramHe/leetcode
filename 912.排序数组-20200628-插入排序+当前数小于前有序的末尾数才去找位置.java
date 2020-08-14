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

        insertSort(nums);

        return nums;
    }

    private void insertSort(int[] nums){

        int length = nums.length;

        for(int i=1;i<length;i++){
            int temp = nums[i];
            
            //只有在新数大于前面有序序列的最后一个数时，才去找位置
            if(nums[i-1]>temp){
                int j = i-1;
                for(;j>=0;j--){
                    if(nums[j]>temp){
                        //移动
                        nums[j+1] = nums[j];
                    }else{
                        break;
                    }
                }
                //找到新数的位置，放上去
                nums[j+1] = temp;
            }
        }
    }
}
// @lc code=end

