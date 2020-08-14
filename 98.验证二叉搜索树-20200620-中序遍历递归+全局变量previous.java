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
    //全局变量，用来保存上一个结点的值。由于叶子结点没有子结点，故将叶子结点的子结点的值设为null
    Integer previous = null;
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        //在判断当前进值之前，如果前面已经有false出现了，则不继续往下递归，直接返回false；
        boolean flag_left = isValidBST(root.left);
        if(!flag_left){
            return false;
        }
        
        //判断当前值是否满足条件
        boolean flag_cur;
        if(previous == null){
            flag_cur = true;
        }else{
            flag_cur = root.val > previous;
        }
        //如果当前值不满足二叉搜索树，直接返回false，切断下一步递归，提高效率。
        if(!flag_cur){
            return false;
        }

		//保存当前结点的值
        previous = root.val;

		//判断当前值后面的序列是否满足条件
        boolean flag_right = isValidBST(root.right);

        //隐式包含了：flag_left=true,flag_cur=true;
        return flag_right;

    }
}
// @lc code=end

