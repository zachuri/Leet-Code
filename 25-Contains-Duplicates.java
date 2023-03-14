import java.util.HashSet;

class Solution {
  public boolean containsDuplicate(int[] nums) {
    Map<Integer> map =new HashMap<Integer>();

    for (int i = 0; i < nums.length; ++i) {
      if (map.contains(nums[i])) {
        return true;
      }
      map.add(nums[i]);
    }

    return false;
  }
}