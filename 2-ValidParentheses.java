class Solution {
  // 1. Create  a Stack of leftSymobls,
  // 2. for loop through each character
  // - check if its a left symbol and push it
  // - then continously check the the rest of the symobls
  // - if the current is right symbol/ leftsymbols is not empty/ and peek the leftSymbols 

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
