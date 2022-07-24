class Solution {
    public boolean isPalindrome(String s) {
		String temp = "";

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				temp += c;
			}
		}

		temp = temp.toLowerCase();

		int i = 0;
		int j = s.length() - 1;

		while ( i <= j) {
			if (temp.charAt(i) != temp.charAt(j)) {
				return false;
			}
			i += 1;
			j -= 1;
		}
		return true;
	}
}
