/*
 * @lc app=leetcode.cn id=938 lang=java
 *
 * [938] 二叉搜索树的范围和
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        //递归出口
        if(root == null){
            return 0;
        }

        /*
        原函数的等价关系式
        */

        //root的val在[L,R]上
        if(root.val>=L && root.val<=R){
            return root.val+rangeSumBST(root.left, L, R)+rangeSumBST(root.right, L, R);
        }else if(root.val<L){
            //root的val在(?,L)上
            return rangeSumBST(root.right, L, R);
        }else{
            //root的val在(R,?)上
            return rangeSumBST(root.left, L, R);
        }
        
    }
}
// @lc code=end

