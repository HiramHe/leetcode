/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(cost==null||gas==null||cost.length==0)return -1;

        int station=0;
        for(;station<gas.length;station++){
            int left=gas[station]-cost[station];
            int i=(station+1)%gas.length;
            for(;i!=station;){
                if(left<0){
                    break;
                }
                left+=gas[i];
                left-=cost[i];
                i=(i+1)%gas.length;
            }

            if(left>=0&&i==station){
                return station;
            }
        }

        return -1;
    }
}
// @lc code=end

