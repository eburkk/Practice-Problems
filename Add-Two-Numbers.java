  
// Problem: 
// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order and each of their nodes contain a single 
// digit. Add the two numbers and return it as a linked list.

// Questions:
//  Can the lists be different lengths? --> yes


// Edge Cases: 
//  - lists of different length
//  - adding 0
//  - when there is a carry to the next digit, especially after traversing both lists and 
//      there is still an additional carry = 1

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int total = cur1.val + cur2.val;
        int carry = total / 10;
        ListNode output = new ListNode(total % 10);
        ListNode cur3 = output;
        cur1 = cur1.next;
        cur2 = cur2.next;

        while (cur1 != null || cur2 != null) {
            int num1 = (cur1 != null) ? cur1.val : 0;
            int num2 = (cur2 != null) ? cur2.val : 0;
            total = carry + num1 + num2;
            carry = total / 10;
            cur3.next = new ListNode(total % 10); 
            cur3 = cur3.next;
            if (cur1 != null) {
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                cur2 = cur2.next;
            }
        }
        
        if (carry == 1) {
            cur3.next = new ListNode(carry);
        }

        return output;
    }
}
