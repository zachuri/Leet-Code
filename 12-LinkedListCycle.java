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


//https://blog.devgenius.io/leetcode-141-linked-list-cycle-solution-with-images-85da536

// Brute Force
public class Solution {
	public boolean hasCycle(ListNode head) {
		Set<ListNode> nodeSeen = new HashSet<>();

    while (head != null) {
      if (nodeSeen.contains(head)) {
        return true;
      }
      else {
        nodeSeen.add(head);
      }

      head = head.next;
    }
    return false;
	}
}

//Two-pointer method
public class Solution {
	public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (fast == slow) {
        return true;
      }
    }

    return false;
	}
}