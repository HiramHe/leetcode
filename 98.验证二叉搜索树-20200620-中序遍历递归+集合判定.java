import java.util.List;

/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {

        /**
         * 中序遍历递归 + 升序判断；
         */

        List<Integer> list = new ArrayList<>();
        
        //获取中序遍历结果
        helper(root, list);


        //中序遍历结果判定
        if(list.size() == 0 || list.size() == 1){
            return true;
        }

        boolean result = true;
        for(int i=1;i<list.size();i++){
            int pre = list.get(i-1);
            int cur = list.get(i);
            if(pre >= cur){
                result = false;
                break;
            }
        }

        return result;

    }

    //中序遍历递归
    private void helper(TreeNode root,List list){
        if(root == null){
            return;
        }

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);

    }
}
// @lc code=end

