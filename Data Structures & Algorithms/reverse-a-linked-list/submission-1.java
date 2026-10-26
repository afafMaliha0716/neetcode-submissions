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
    public ListNode reverseList(ListNode head) {
        // have a prev node stored and then set the head to null;
        ListNode cur = head;
        ListNode next = null;
        ListNode prev = null;
        while(cur!=null){
            // go through and update the next nodes
            prev = cur.next; // so we know where ot moev to next
            cur.next = next; // update this ones next to be the one before
            next = cur; // update the next to be this one so we can use it on next iteration
            cur = prev; // now move

        }
        return next;
    }
}
