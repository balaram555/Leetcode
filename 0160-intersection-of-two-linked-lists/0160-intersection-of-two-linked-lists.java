/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode s1=headA;
        ListNode s2=headB;
        ArrayList<ListNode> list=new ArrayList<>();
        while(s1!=null){
            list.add(s1);
            s1=s1.next;
        }
        while(s2!=null){
            if(list.contains(s2))
            return s2;
            s2=s2.next;
        }
        return null;
    }
}