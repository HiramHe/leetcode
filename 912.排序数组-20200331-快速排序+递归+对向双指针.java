/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        if(nums==null){
            return nums;
        }
        int length=nums.length;
        if(length==0||length==1){
            return nums;
        }
        fastSort(nums, 0, length-1);
        return nums;
    }

    static void fastSort(int[] nums,int i,int j){
        if(i>=j)return;

        int base=nums[j];
        int left=i;
        int right=j-1;
        while(left<=right){
            while(left<=right&&nums[left]<=base){
                left++;
            }
            while(right>=left&&nums[right]>=base){
                right--;
            }
            if(left>=right)break;
            if(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }

        nums[j]=nums[left];
        nums[left]=base;

        fastSort(nums, i, left-1);
        fastSort(nums, right+1, j);

    }
}
// @lc code=end

