import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {

        /*
        层序遍历
        */

        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            //保存当前层的节点个数
            int levelSize = queue.size();
            TreeNode temp = null;
            
            for(int i=1;i<=levelSize;i++){
                temp = queue.remove();

                //拿到当前层最后一个节点，即是从右侧能看到的节点
                if(i == levelSize){
                    result.add(temp.val);
                }

                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }

        return result;
    }
}
// @lc code=end

