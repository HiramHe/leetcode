import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates ==null || candidates.length==0){
            return null;
        }

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        helper(path, 0, candidates,0,target, result);

        return result;
    }

    void helper(List<Integer> path,int pathSum,int[] candidates,int start,int target,List<List<Integer>> result){
        if(pathSum == target){
            /*
            不能直接添加path，因为path里面的值一直在变动；
            如果path满足了需求，需要重新new一个List，用path去初始化即可。
            */
            result.add(new ArrayList(path));
            return;
        }

        /*
        如果path里面的值的和已经超过target了，就没必要继续往path里面添加值了。
        否则，递归会一直做下去，导致栈空间溢出。
        */
        if(pathSum<target){
            
            for (int i = start;i<candidates.length;i++) {
                
                if(i>0 && candidates[i]==candidates[i-1]){
                    continue;
                }

                int candidate = candidates[i];

                //做选择
                path.add(candidate);
                pathSum+=candidate;
                
                //回溯
                helper(path, pathSum, candidates,i+1, target, result);
                
                //撤销选择
                path.remove(path.size()-1);
                pathSum-=candidate;
            }
        }
        
    }
}
// @lc code=end

