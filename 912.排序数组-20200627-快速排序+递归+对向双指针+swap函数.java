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

        quickSort(nums, 0, nums.length-1);

        return nums;
    }

    private void quickSort(int[] nums,int left,int right){
        if(left >= right){
            return;
        }

        int pivot = nums[right];
        int i = left;
        int j = right;

        while(i < j){
            //从左往右扫描，找到比标兵大的为止
            while(i < j && nums[i]<=pivot){
                i++;
            }
            //从右往左扫描，找到比标兵小的为止
            while(i < j && nums[j]>=pivot){
                j--;
            }
            //交换找到的两个数
            if(i < j){
                swap(nums, i, j);
            }
        }
        //标兵回到正确位置
        swap(nums, i, right);

        quickSort(nums, left, i-1);
        quickSort(nums, i+1, right);

    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
// @lc code=end

