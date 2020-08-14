import java.util.List;

/*
 * @lc app=leetcode.cn id=187 lang=java
 *
 * [187] 重复的DNA序列
 */

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        if(s == null || s.length() == 0){
            return result;
        }

        for(int i=0;i<=s.length()-20;i++){
            int ch = s.charAt(i);
            int j = i+1;
            for(;j-i<20;j++){
                ch ^= s.charAt(j);
            }
            if(ch==0){
                result.add(s.subSequence(i, i+10).toString());
            }
        }

        return result;
    }
}
// @lc code=end

