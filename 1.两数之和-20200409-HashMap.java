import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums==null){
            return null;
        }

        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int j=0;j<nums.length;j++){
            int another=target-nums[j];
            if(map.containsKey(another) && map.get(another)!=j){
                ans[0]=j;
                ans[1]=map.get(another);
                return ans;
            }
        }

        return null;
        
    }
}
// @lc code=end

