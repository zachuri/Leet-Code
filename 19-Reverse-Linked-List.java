//Visualization: https://www.geeksforgeeks.org/reverse-a-linked-list/
// Solution: https://github.com/varunu28/LeetCode-Java-Solutions/blob/master/Easy/Reverse%20Linked%20List.java

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
    ListNode prev = null;
    ListNode next = null;
    ListNode curr = head;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
}