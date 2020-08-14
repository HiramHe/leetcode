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

        int[] fibs = new int[N+1];
        fibs[0]=0;
        fibs[1]=1;

        for(int i=2;i<fibs.length;i++){
            fibs[i]=fibs[i-1]+fibs[i-2];
        }

        return fibs[N];
    }
}
// @lc code=end

