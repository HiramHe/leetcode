/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }

        //哑结点，非常重要。可以大大简化对删除链表首节点或末节点的处理
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode fast=head;
        ListNode slow=head;
        ListNode pre=dummy;

        //拿链表长度为3，n=1进行手动推演
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            pre=slow;
            slow=slow.next;
        }

        pre.next=slow.next;

        return dummy.next;

    }
}
// @lc code=end

