/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        if(N<=1){
            return N;
        }

        int curMinus1=1;
        int curMinus2=0;

        int ans=0;
        for(int i=2;i<=N;i++){
            ans=curMinus1+curMinus2;
            
            curMinus2=curMinus1;
            curMinus1=ans;
        }

        return ans;
    }
}
// @lc code=end

