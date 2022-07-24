class Solution {
	public boolean isValid(String s) {
		Stack<Character> leftSymbols = new Stack<>();

		for (char curr : s.toCharArray()) {
			if (curr == '(' || curr== '{' || curr == '[') {
				leftSymbols.push(curr);
			}		
			else if (curr == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
				leftSymbols.pop();
			}
			else if (curr == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
				leftSymbols.pop();
			}
			else if (curr == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
				leftSymbols.pop();
			}
			else {
				return false;
			}
		}

		return leftSymbols.isEmpty();
	}
}

// Time Complexity: O(n), Space Complexity O(n);
