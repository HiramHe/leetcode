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

        int length=s.length();
        Set<Character> set=new HashSet<>();

        int ans=0,i=0,j=0;

        //j一直往前走
        while(i<length && j<length){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans=Math.max(ans, j-i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return ans;
    }
}
// @lc code=end

