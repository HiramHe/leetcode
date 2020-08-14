import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result=new ArrayList<>();
        
        while(true){
            while(root!=null){
                result.add(root.val);
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()){
                return result;
            }
            root=stack.pop();
            root=root.right;
        }
    }
}
// @lc code=end

