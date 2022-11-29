class Solution {
  public int maxProfit(int[] prices) {
    // 1. check if null
    // 2. keep track of min
    // 3. keep track of result

	  if (prices == null || prices.length <= 1) {
		  return 0;
	  }

	  int min = prices[0];
	  int result = 0;

	  for (int i = 0; i < prices.length; ++i) {
		  result = Math.max(result, prices[i] - min);
		  min= Math.min(min, prices[i]);
	  }
	  return result;
  }
}

// Time Complexity = O(n) / Space Complexity = O(1) 
