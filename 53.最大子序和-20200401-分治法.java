/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)return Integer.MIN_VALUE;

        return helper(nums,0,nums.length-1);
    }

    static int helper(int[] nums,int left,int right){
        if(left==right)return nums[left];

        int middle=(left+right)/2;
        int leftSum=helper(nums, left, middle);
        int rightSum=helper(nums,middle+1,right);
        int crossSum=crossSum(nums, left, right, middle);
        return Math.max(Math.max(leftSum, rightSum),crossSum);
    }

    static int crossSum(int[] nums,int left,int right,int middle){
        if(left==right)return nums[left];

        int left2middleSum=nums[middle];
        int tempSum=0;
        for(int i=middle;i>=left;i--){
            tempSum+=nums[i];
            if(tempSum>=left2middleSum){
                left2middleSum=tempSum;
            }
        }

        int middle2rightSum=nums[middle];
        tempSum=0;
        for(int j=middle;j<=right;j++){
            tempSum+=nums[j];
            if(tempSum>=middle2rightSum){
                middle2rightSum=tempSum;
            }
        }

        //nums[middle]多加了一次
        return left2middleSum+middle2rightSum-nums[middle];
    }
}
// @lc code=end

