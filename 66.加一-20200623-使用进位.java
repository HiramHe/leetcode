/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        int carry = 0;
        for(int i=digits.length-1;i>=0;i--){
            int sum = 0;
            if(i == (digits.length-1)){
                sum = digits[i] + 1 + carry;
            }else{
                sum = digits[i] + carry;
            }
            carry = sum/10;
            digits[i] = sum%10;
        }

        if(carry == 0){
            return digits;
        }

        int[] result = new int[digits.length+1];
        result[0]=carry;
        for(int j=0;j<digits.length;j++){
            result[j+1] = digits[j];
        }
        return result;
    }
}
// @lc code=end

