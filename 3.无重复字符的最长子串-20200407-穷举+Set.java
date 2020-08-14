import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }

        Set<Character> set=new HashSet<>();

        int ans=0;

        for(int i=0;i<s.length();i++){
            set.clear();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                }else{
                    break;
                }
            }
            ans=Math.max(ans, set.size());
        }

        return ans;

    }
}
// @lc code=end

