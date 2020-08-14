/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        if(numbers == null || numbers.length <= 1){
            return null;
        }

        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                result[0] = left + 1;
                result[1] = right + 1;

                return result;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return null;
    }
}
// @lc code=end

