class Solution {
    public boolean isPalindrome(String s) {
    // 1. Check if string is a letter or number Character.is()...
    // 2. Lowercase all of them
    // 3. create index count for start and end of array
    // 4. check if each index is the same else false;
		String temp = "";        

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
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

