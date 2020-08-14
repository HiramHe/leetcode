/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        
        int end = numbers.length - 1;
        //每次拿出一个数，使用二分查找去找另一个数
        for(int i=0;i<numbers.length-1;i++){
            Integer index = bSearch(numbers, i+1, end, target-numbers[i]);
            if(index != null){
                result[0] = i+1;
                result[1] = index+1;
                return result;
            }
        }

        return null;
    }

    //二分查找
    protected Integer bSearch(int[] numbers,int start,int end,int another){

        int left = start,right = end;

        while(left<=right){
            int middle = left + (right-left)/2;

            if(numbers[middle] == another){
                return middle;
            }else if(numbers[middle] < another){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }

        return null;
    }
}
// @lc code=end

