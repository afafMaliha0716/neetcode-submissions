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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // start at the head and keep a running list of the length
        // and once your at the end subtract n from the length and move through list again until you hit that index. store the prev node and the one youre removings next node so you can link them together.
        ListNode cur = head;
        if(head.next == null){
            return null;
        }
        
        int size = 0;
        while(cur!=null){
            cur = cur.next;
            size++;
        }

        int remove = size - n;
        int index = 0;
        cur = head;
        while(cur!=null){
            // need to stop at the one - 1 so we can store it as the prev
            if (index == remove - 1){
                ListNode prev = cur;
                cur = prev.next;
                if(cur.next== null){
                    prev.next = null;
                } else {
                    prev.next = cur.next;
                }
                break;
            }
            index++;
            cur=cur.next;
        }
            if (n == size) {
        return head.next;
    }
        return head;
    }
}
