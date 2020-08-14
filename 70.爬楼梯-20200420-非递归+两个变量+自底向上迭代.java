/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }

        //最后一次爬了1步
        int waysBeforeOneStep=1;
        //最后一次爬了2步
        int waysBeforeTwoStep=2;
        //F(N)=F(N-1) + F(N-2)

        int ways=0;
        for(int i=3;i<=n;i++){
            ways=waysBeforeOneStep + waysBeforeTwoStep;

            waysBeforeOneStep=waysBeforeTwoStep;
            waysBeforeTwoStep=ways;
        }

        return ways;
    }
}
// @lc code=end

