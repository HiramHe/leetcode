/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        //head：首元结点
        //Head：头结点
        ListNode Head = new ListNode();
        Head.next = head;

        ListNode pre,first,second,temp;
        pre = Head;
        first = head;

        while(first != null){
            second = first.next;

            //奇数个结点，最后一个结点不需要两两交换
            if(second == null ){
                break;
            }

            //临时保存第三个结点
            temp = second.next;

            //交换当前两个结点
            second.next = first;
            //奇数个结点，把最后一个结点链上
            first.next = temp;

            //前面的结点与当前两个结点链起来
            pre.next = second;

            //处理下（两）个结点
            pre = first;
            first = temp;
        }

        return Head.next;
    }
}
// @lc code=end

