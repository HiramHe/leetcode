/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode pre = null;
        ListNode worker = head;
        ListNode post = worker.next;

        while(post!=null){
            worker.next = pre;

            pre = worker;
            worker = post;
            post=worker.next;
        }
        //走到链表的最后一个结点，还没有修改该结点的指针指向
        worker.next = pre;

        return worker;
    }
}
// @lc code=end

