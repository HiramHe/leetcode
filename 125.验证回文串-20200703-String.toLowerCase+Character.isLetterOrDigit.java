/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length()==0){
            return true;
        }

        //将大写字母转化为小写字母
        String newStr = s.toLowerCase();

        int left = 0;
        int right = newStr.length() - 1;

        while(left <= right){

            //非字母和数字
            while(left<=right && !Character.isLetterOrDigit(newStr.charAt(left))){
                left++;
            }
            
            //非字母和数字
            while(left<=right && !Character.isLetterOrDigit(newStr.charAt(right))){
                right--;
            }

            //两个if不能合起来，如果s为空字符串，则会出现left>right，但我们需要返回true
            if(left <= right){
                if(newStr.charAt(left)==newStr.charAt(right)){
                    left++;
                    right--;
                }else{
                    return false;
                }
            }
            
        }

        return true;
    }
}
// @lc code=end

