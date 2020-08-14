import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int result=0;
        for(int num:nums){
            if(set.contains(num)){
                result=num;
                break;
            }
            set.add(num);
        }
        return result;
    }
}
// @lc code=end

