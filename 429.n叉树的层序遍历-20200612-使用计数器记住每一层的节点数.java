import java.util.Queue;

import com.sun.org.apache.bcel.internal.classfile.Node;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> results = new ArrayList<>();

        if(root == null){
            return results;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            //记下每一层的节点数
            int count = queue.size();
            List<Integer> list = new ArrayList<>();

            //遍历当前层
            Node temp = null;
            while(count >0){
                temp = queue.poll();
                list.add(temp.val);

                if(temp.children != null){
                    for(Node child:temp.children){
                        queue.add(child);
                    }
                }
                count--;
            }
            results.add(list);
        }

        return results;

    }
}
// @lc code=end

