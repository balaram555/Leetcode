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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode current=head;
        int l=0;
        while(current!=null){
            current=current.next;
            l++;
        }
        int p=l/k;
        int e=l%k;
        ListNode[] arr=new ListNode[k];
        ListNode cur=head;
        for(int i=0;i<k;i++){
            if(cur==null){
                arr[i]=null;
                continue;
            }
            arr[i]=cur;
            int pp=p;
            if(i<e)
            pp=pp+1;
            for(int j=1;j<pp;j++)
            cur=cur.next;

            ListNode np=cur.next;
            cur.next=null;
            cur=np;
        }
        return arr;
    }
}