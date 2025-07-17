/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        while(head==null||head.next==null){
            return null;
        }
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            ListNode start=head;
            while(start!=slow){
                slow=slow.next;
                start=start.next;
            }
            return start;
        }
       } 
       return null;
    }
}