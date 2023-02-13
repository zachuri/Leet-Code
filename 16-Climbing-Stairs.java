// Bottom up approach
// bascially fib -> instead of recalulating each step
// O(
class Solution {
  public int climbStairs(int n) {
    int pre = 1;
    int curr = 1;
    int temp = 0;

    for (int i = 0; i < n - 1; ++i) {
      temp = curr;
      curr = curr + pre;
      pre = temp;
    }      

    return curr;
  }
}
