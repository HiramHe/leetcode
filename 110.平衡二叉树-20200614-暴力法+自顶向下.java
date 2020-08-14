import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    /*
    暴力解法，自顶向上，会有很多重复计算
    */

    public boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }

        /*
        前序遍历
        */

        //获取左右子树深度
        int subLeftDepth = depth(root.left);
        int subRightDepth = depth(root.right);
        
        //判断当前节点
        boolean cur = Math.abs((subLeftDepth-subRightDepth))<=1;

        //判断左右子树
        boolean curLeft = isBalanced(root.left);
        boolean curRight = isBalanced(root.right);

        return cur && curLeft && curRight;
    }

    int depth(TreeNode node){
        if(node == null){
            return 0;
        }

        /*
        后序遍历
        */

        int subLeftDepth = depth(node.left);
        int subRightDepth = depth(node.right);

        return Math.max(subLeftDepth, subRightDepth)+1;
    }
}
// @lc code=end

