import java.util.Arrays;

import sun.security.util.Length;

/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g==null || s==null || g.length==0 || s.length==0){
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int i=0,j=0,ans=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                ans++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return ans;
    }
}
// @lc code=end

