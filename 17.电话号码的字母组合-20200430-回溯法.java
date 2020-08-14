import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        /**
         * 异常处理
         */
        if(digits==null || digits.length()==0){
            return result;
        }

        /**
         * 封装每一个数字对应的各个字母
         */
        Map<Character,String> digitStrMap = new HashMap<>();
        digitStrMap.put('2',"abc");
        digitStrMap.put('3',"def");
        digitStrMap.put('4',"ghi");
        digitStrMap.put('5',"jkl");
        digitStrMap.put('6',"mno");
        digitStrMap.put('7',"pqrs");
        digitStrMap.put('8',"tuv");
        digitStrMap.put('9',"wxyz");

        /**
         * 调用回溯函数
         */
        backtrack(new StringBuilder(), digits, 0,digitStrMap,result);

        return result;
        
    }

    /**
     * strBuilder：路径
     * digits + location：确定当前要处理的数字
     * 
     * @param strBuilder：路径
     * @param digits
     * @param location
     * @param digitStrMap
     * @param result
     */
    public void backtrack(StringBuilder strBuilder,String digits,int location,Map<Character,String> digitStrMap,List<String> result){
        
        /**
         * 满足结束条件
         */
        if(location==digits.length()){
            result.add(strBuilder.toString());
            return ;
        }

        /**
         * 拿到当前的数字
         */
        char digit = digits.charAt(location);
        /**
         * 拿到数字对应的各个字母
         */
        String str = digitStrMap.get(digit);

        /**
         * 选择列表
         */
        for(int i=0;i<str.length();i++){

            char digitChar = str.charAt(i);

            /**
             * 做出选择
             */
            strBuilder.append(digitChar);

            /**
             * 回溯
             */
            backtrack(strBuilder, digits, location+1,digitStrMap,result);

            /**
             * 撤销当前选择
             */
            strBuilder.deleteCharAt(strBuilder.length()-1);

        }
    }
}
// @lc code=end

