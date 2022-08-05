class Solution {
    public boolean isPalindrome(String s) {

		if (s.isEmpty()) {
			return true;
		}

		String temp = "";

		for (char c : s.toCharArray()) {
			if (Character.isLetter(c) || Character.isDigit(c)) {
				temp += c;
			}
		}

		temp = temp.toLowerCase();
		int a = 0;
		int b = temp.length() - 1;

		while (a < b) {
			if (temp.charAt(a) != temp.charAt(b)) {
				return false;
			}

			a += 1; 
			b -= 1; 
		}
		
		return true;
    }
}

