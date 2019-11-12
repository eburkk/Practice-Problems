// Problem: 
// Reverse a linked list.

// Questions:
//  Singly or doubly linked? --> singly

// Edge Cases: 
//  - list is null/empty

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;
        
        while (cur != null) {
            next = cur.next;
            cur.next = prev; 
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
}
