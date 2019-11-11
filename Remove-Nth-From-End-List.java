// Problem:
// Given a linked list, remove the n-th node from the end of list and return its head.

//Questions: 
//  Can we assume n <= list length? --> yes, n will always be valid
//  Is this a singly or doubly linked list? --> singly linked

// Edge cases:
//  head == null
//  n is bigger than list length (NA)
//  n is size of the list, so remove the front

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head != null) {
            ListNode window = head;
            ListNode nFromEnd = head;
            for (int i = 0; i < n; i++) {           //creating the window
                window = window.next;
            }
            if (window == null) {                   // this means n = size of list --> remove head node
                head = head.next;
                return head;
            }
            while (window.next != null) {           // go until you reach end of list
                window = window.next;
                nFromEnd = nFromEnd.next;
            }  
            nFromEnd.next = nFromEnd.next.next;     // removing nth from end node
        }
        return head;
    }
}
