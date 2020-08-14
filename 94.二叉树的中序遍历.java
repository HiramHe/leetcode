/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> inorder = new ArrayList();
        while(true){
            while(root != null){
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()){
                return inorder;
            }
            root=stack.pop();
            inorder.add(root.val);
            root=root.right;
        }
    }
}
// @lc code=end

