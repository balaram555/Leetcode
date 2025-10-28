/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        head=Reverse(head);
        int val=head.val;
        ListNode current=head;
        while(current!=null&&current.next!=null){
            if(current.next.val<val)
            current.next=current.next.next;
            else
            {
                current=current.next;
                val=current.val;
            }
        }
        return Reverse(head);
    }
    public ListNode Reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}