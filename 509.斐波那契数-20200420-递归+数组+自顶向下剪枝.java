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
        Arrays.fill(fibs,0);
        fibs[1]=1;

        int ans = helper(fibs,N);

        return ans;
    }

    int helper(int[] fibs,int i){

        if(i<=1){
            return fibs[i];
        }

        if(fibs[i]!=0){
            return fibs[i];
        }
        
        fibs[i] = helper(fibs,i-1)+helper(fibs,i-2);

        return fibs[i];
    }
}
// @lc code=end

