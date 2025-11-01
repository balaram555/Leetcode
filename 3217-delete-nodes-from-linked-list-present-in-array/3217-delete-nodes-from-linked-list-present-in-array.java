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
    public ListNode modifiedList(int[] nums, ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        // for (int num : nums) {
        //     list.remove(Integer.valueOf(num));
        // }
         HashSet<Integer> elements = new HashSet<>();
        for (int num : nums) {
            elements.add(num);
        }

        // Remove elements that are in the HashSet
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer currentValue = iterator.next();
            if (elements.contains(currentValue)) {
                iterator.remove();
            }
        }

        
        if (list.isEmpty()) {
            return null; 
        }
        
        ListNode newHead = new ListNode(list.get(0));
        ListNode newCurrent = newHead;
        for (int i = 1; i < list.size(); i++) {
            newCurrent.next = new ListNode(list.get(i));
            newCurrent = newCurrent.next;
        }
        
        return newHead
        ;
    }
}