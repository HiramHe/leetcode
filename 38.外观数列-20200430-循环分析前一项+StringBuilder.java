/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {

        /**
         * 处理简单n
         */
        if(n<=1){
            return new StringBuilder().append(n).toString();
        }

        String pre = "1";
        
        /**
         * 控制循环次数
         */
        while(n>1){

            /**
             * 每一次循环，分析前一项的结构
             */

            StringBuilder current = new StringBuilder();

            char target = pre.charAt(0);
            int countTarget = 0;
            char curChar;

            /**
             * 遍历前一项的每一个数字
             */
            for(int i=0;i<pre.length();i++){
                curChar = pre.charAt(i);

                /**
                 * 统计连续重复的数字
                 */
                if(curChar==target){
                    countTarget++;
                }else{
                    current.append(countTarget);
                    current.append(target);

                    target = curChar;
                    countTarget = 1;
                }
            }
            /**
             * 前一项遍历完，把最后的countTarget和target加到当前StringBuilder中
             */
            current.append(countTarget);
            current.append(target);

            /**
             * 将前一项置为分析结果
             */
            pre = current.toString();
            
            /**
             * 进行下一轮分析
             */
            n--;
            
        }

        return pre;
    }
}
// @lc code=end

