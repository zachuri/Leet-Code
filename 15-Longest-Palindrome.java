class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = 0;
        for(char c: s.toCharArray()){
            if(++count[c] == 2){
                length += 2;
                count[c] = 0;
            }
        }
        return (length == s.length())? length: length+1;
    }
}


class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}

// Solution: Iterate the string, for each character, 
// try to expand left and right to get the longest palindromic substring
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.trim().equals("")) {
            return s;
        }
        int len = s.length();
        int begin = 0;
        int maxLen = 0;
        for (int i = 0; i < len - maxLen / 2; i++) {
            int j = i;
            int k = i;
            while (k < len - 1 && s.charAt(k) == s.charAt(k + 1)) { 
		// Skip duplicated characters to the right
                k++;
            }
            while (j > 0 && k < len - 1 && s.charAt(j-1) == s.charAt(k+1)) { 
		// Expand both left and right
                j--;
                k++;
            }
            int newLen = k - j + 1;
            if (newLen > maxLen) {
                begin = j;
                maxLen = newLen;
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
