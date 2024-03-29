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
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // 1. check if its null
    // 2. head 
    // 3. loop through each list and see each l val is smaller 
    // 4. loop through the rest of each node if there is any 
    // Check if ant of the lists are null

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    // Head of the result list
    ListNode head;
    // Pointer for the resultant list
    ListNode temp;
    // Choose head which is smaller of the two lists
    if (l1.val < l2.val) {
      temp = head = new ListNode(l1.val);
      l1 = l1.next;
    } else {
      temp = head = new ListNode(l2.val);
      l2 = l2.next;
    }
    // Loop until any of the list becomes null
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        temp.next = new ListNode(l1.val);
        l1 = l1.next;
      } else {
        temp.next = new ListNode(l2.val);
        l2 = l2.next;
      }
      temp = temp.next;
    }
    // Add all the nodes in l1, if remaining
    while (l1 != null) {
      temp.next = new ListNode(l1.val);
      l1 = l1.next;
      temp = temp.next;
    }
    // Add all the nodes in l2, if remaining
    while (l2 != null) {
      temp.next = new ListNode(l2.val);
      l2 = l2.next;
      temp = temp.next;
    }
    return head;
	}
}

// Time Complexity = O(a + b) based on the different sizes of nodes.

