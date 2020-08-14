import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones==null || stones.length==0){
            return 0;
        }
        if(stones.length==1){
            return stones[0];
        }

        int i=stones.length-1;
        for(;i>=1;i--){
            Arrays.sort(stones,0,i+1);
            stones[i-1]=stones[i]-stones[i-1];
        }

        return stones[0];
    }
}
// @lc code=end

