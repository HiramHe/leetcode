import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                result.add(nums2[j]);
            }
        }

        int[] ans=new int[result.size()];
        int m=0;
        for(int num:result){
            ans[m++]=num;
        }

        return ans;
    }
}
// @lc code=end

