/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// https://medium.com/@nisargdevdhar/leetcode-solution-72406f05b78a

// Brute Force
public class Solution {
  public boolean hasCycle(ListNode head) {
    Set<ListNode> nodesSeen = new HashSet<>();
    while (head != null) {
        if (nodesSeen.contains(head)) {
            return true
        } else {
            nodesSeen.add(head);
        }
        head = head.next;
    }
    return false;
  }
}

//Two pointer method 
public class Solution {
  public boolean hasCycle(ListNode head) {
      if (head == null) {
          return false;
      }
      ListNode slow = head;
      ListNode fast = head.next;
      while (slow != fast) {
          if (fast == null || fast.next == null) {
              return false;
          }
          slow = slow.next;
          fast = fast.next.next;
      }
      return true;
  }
}