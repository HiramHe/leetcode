/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){
            //如果有进位，则进位只可能是1
            digits[i]++;
            digits[i] %= 10;
            //如果没有进位，结束循环，直接返回
            if(digits[i] != 0){
                return digits;
            }
        }

        //一直有进位，比如999，那么将数组长度+1，最高位设置为1即可
        digits = new int[digits.length+1];
        digits[0] = 1;

        return digits;
    }
}
// @lc code=end

