/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
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
    public int sumNumbers(TreeNode root) {

        int sum = helper(root,0);

        return sum;
    }

    private int helper(TreeNode root,int num){

        //非叶子节点，但是只有左子树或者右子树
        if(root == null){
            return 0;
        }

        //构建数值
        num = num*10 + root.val;

        //叶子节点，递归出口。找到了一条路径，返回路径节点组成的数值
        if(root.left == null && root.right == null){
            return num;
        }

        int sum_left = helper(root.left,num);
        int sum_right = helper(root.right,num);
        
        int sum = sum_left + sum_right;

        return sum;
    }
}
// @lc code=end

