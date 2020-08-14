import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        if(candidates ==null || candidates.length==0){
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> path = new ArrayList<>();

        helper(path, 0, candidates,0,target, result);

        return result;

    }

    /**
     * 
     * @param path 回溯使用：路径
     * @param pathSum 递归结束使用：路径和
     * @param candidates 回溯使用：选择
     * @param start 去重使用
     * @param target 递归结束使用
     * @param result 递归结束使用
     */
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
            /*
            去重
            i从上次选择的地方开始，而不是从0开始，
            避免出现[2,2,3]、[3,2,2]这种重复的结果
            */
            for (int i = start;i<candidates.length;i++) {
                
                
                //做选择
                int candidate = candidates[i];
                path.add(candidate);
                pathSum+=candidate;
                
                //回溯
                helper(path, pathSum, candidates,i, target, result);
                
                //撤销选择
                path.remove(path.size()-1);
                pathSum-=candidate;
            }
        }
        
    }
}
// @lc code=end

