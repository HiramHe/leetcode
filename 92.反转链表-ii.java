/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head ==null){
            return head;
        }

        ListNode redundantNode=new ListNode();
        redundantNode.next=head;

        ListNode nodeMPre=null;
        ListNode nodeM=null;
        ListNode pre = null;
        ListNode worker = redundantNode;
        ListNode post = worker.next;
        
        int i=1;
        for(;i<=m;i++){
            pre=worker;
            worker=post;
            post=worker.next;
        }
        nodeMPre=pre;
        nodeM=worker;
        
        for(;i<=n;i++){
            pre=worker;
            worker=post;
            post=worker.next;
            worker.next=pre;
        }
        
        nodeMPre.next=pre;
        nodeM.next=worker;

        return redundantNode.next;

    }
}
// @lc code=end

