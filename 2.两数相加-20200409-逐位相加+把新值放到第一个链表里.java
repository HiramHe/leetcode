/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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

 /*
 *思想：把计算的值放到链表l1中，这样就不用重新开辟空间了
 *
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        ListNode point1=l1;
        ListNode point2=l2;
        //当point1为null时，pre指向point1的前一个结点，这样就可以在l1扫描完之后，连接到l2上
        ListNode pre=l1;
        
        int sum=0,value=0,carrier=0;
        

        //l1、l2都没有扫描完
        while(point1!=null && point2!=null){

            sum=point1.val+point2.val+carrier;
            value=sum%10;
            carrier=sum/10;
            //把新值放到l1的节点中，不重新创建链表
            point1.val=value;

            pre=point1;

            point1=point1.next;
            point2=point2.next;

        }

        //l2扫描完了，l1不一定
        while(point1!=null){
            sum=point1.val+carrier;
            value=sum%10;
            carrier=sum/10;
            point1.val=value;

            pre=point1;

            point1=point1.next;
        }

        //或者：l1扫描完了，l2不一定
        while(point2!=null){
            //将l1的末尾指向l2
            pre.next=point2;

            sum=point2.val+carrier;
            value=sum%10;
            carrier=sum/10;
            //将l2的结点的值更新为新值
            point2.val=value;

            pre=point2;
            point2=point2.next;
        }

        //进位可能还有，加在结果链表的末尾
        if(carrier!=0){
            pre.next=new ListNode(carrier);
        }

        return l1;
    }
}
// @lc code=end

