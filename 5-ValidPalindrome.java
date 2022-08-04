class Solution {
    public boolean isPalindrome(String s) {
		String str = "";        

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				str += c;
			}
		}

		str = str.toLowerCase();
		int a = 0;
		int b = str.length() - 1;

		while (a < b) {
			if (str.charAt(a) != str.charAt(b)) {
				return false;
			}

			a += 1;
			b -= 1;
		}

		return true;
    }
}

