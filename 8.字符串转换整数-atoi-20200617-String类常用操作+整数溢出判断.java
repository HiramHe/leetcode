/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        if(str == null){
            return 0;
        }

        //去除前后空格
        String newStr = str.trim();
        if("".equals(newStr)){
            return 0;
        }

        int begin = 0;
        boolean isNegative = false;

        //找到第一个数字字符
        char first = newStr.charAt(begin);
        if(first=='+'){
            isNegative = false;
            begin++;
        }else if(first == '-'){
            isNegative = true;
            begin++;
        }else if(first<'0' || first>'9'){
            return 0;
        }

        int result = 0;
        while(begin<newStr.length()){
            char temp = newStr.charAt(begin);

            //非数字字符，结束循环
            if(temp<'0' || temp >'9'){
                break;
            }

            int value = temp - '0';

            //判断是否溢出，解不等式即可
            //result*10 + value > Integer.MAX_VALUE
            int up =  (Integer.MAX_VALUE-value)/10;
            //result*10 - value < Integer.MIN_VALUE
            int low = (Integer.MIN_VALUE+value)/10;
            if(result > up){
                return Integer.MAX_VALUE;
            }else if(result < low){
                return Integer.MIN_VALUE;
            }
            
            //正负决定着表达式的不同
            if(isNegative){
                //负数
                result = result*10 - value;
            }else{
                //正数
                result = result*10 + value;
            }
            
            begin++;
        }

        return result;
    }
}
// @lc code=end

