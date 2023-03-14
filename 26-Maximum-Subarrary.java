class Solution {
  public int maxSubArray(int[] nums) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int num : nums) {
      currSum += num;
      if (currSum < maxSum) {
        currSum = num;
      }

      maxSum = Math.max(currSum, maxSum);
    }

    return maxSum;
  }
}