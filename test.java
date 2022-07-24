class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		// check if either node is empty
		if (l1 == null) {
			return l2;
		}
		
		if (l2 == null) {
			return l1;
		}

		ListNode temp;	
		ListNode head;	

		// find the head of either node
		if (l1.val < l2.val) {
			temp = head = new ListNode(l1.val);
			l1 = l1.next;
		}
		else {
			temp = head = new ListNode(l2.val);
			l2 = l2.next;
		}

		// Check the next value of the either node
		while (l1 != null && l2 != null) { 
			if (l1.val < l2.val) {
				temp.next = new ListNode(l1.val);
				l1 = l1.next;
			}
			else {
				temp.next = new ListNode(l2.val);
				l2 = l2.next;
			}

			temp = temp.next;
		}


		// Comple
		while (l1 != null) {
			temp.next = new ListNode(l1.val);
			l1 = l1.next;
			temp = temp.next;
		}
		
		while (l2 != null) {
			temp.next = new ListNode(l2.val);
			l2 = l2.next;
			temp = temp.next;
		}

		return head;
	}
}
