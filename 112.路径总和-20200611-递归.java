/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }

        sum = sum - root.val;
        if(root.left == null && root.right == null){
            return sum == 0;
        }else{
            return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
        }

    }
}
// @lc code=end

