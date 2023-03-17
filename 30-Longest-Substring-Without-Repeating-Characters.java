class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length();

    int ans = 0;

    int[] index = new int[128];

    // i is the left pointer, j is the rigth pointer
    for (int i = 0, j = 0; j < n; j++) {
      // get the max for i for current i vs at certain index of j
      i = Math.max(index[s.charAt(j)], i);

      // get max of curr answer vs j and i
      ans = Math.max(ans, j - i + 1);

      // at j increase index by 1
      index[s.charAt(j)] = j + 1;
    }

    return ans;
  }
}