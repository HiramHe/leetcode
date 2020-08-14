import java.awt.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        helper(root, "", result);

        return result;
    }

    //path 不能是StringBuilder这种引用类型；
    //因为 helper(root.left, path,list) 会修改path的值，
    //如果path为引用变量，那么对path的修改会进入
    //helper(root.right, path, list);
    //而我们希望的是：进入这两个递归的path的值是同一个值。
    private void helper(TreeNode root,String path,List list){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            path += Integer.toString(root.val);
            list.add(path);
            return;
        }

        path += Integer.toString(root.val) + "->";

        helper(root.left, path,list);
        helper(root.right, path, list);

    }
}
// @lc code=end

