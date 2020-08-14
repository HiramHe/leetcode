import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results=new ArrayList<>();
        if(root==null)return results;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int queueSize=0;
        int level=0;
        TreeNode node=null;
        while(!queue.isEmpty()){
            queueSize=queue.size();
            results.add(new ArrayList<>());
            for(int i=0;i<queueSize;i++){
                node=queue.remove();
                results.get(level).add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            level++;
            
        }

        return results;
    }
}
// @lc code=end

