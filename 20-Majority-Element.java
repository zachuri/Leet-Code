
// Other solutions
//  https://aaronice.gitbook.io/lintcode/array/majority-element

//https://www.youtube.com/watch?v=gY-I8uQrCkk

class Solution {
  public int majorityElement(int[] nums) {
    int candidate = 0;
    int count = 0;

    for (int element : nums) {
      if (count ==0 ) candidate = element;
      if (element == candidate) ++count;
      else --count;
    }
    return candidate;
  }
}


// Boyer-Moore Voting Algorithm
class Solution {
  public int majorityElement(int[] nums) {
    int majorityElement = nums[0]; 
    int count = 0;

    for (int num : nums) {
      if (count == 0) {
        majorityElement = num;
      }
      count += num == majorityElement ? 1 : -1;
    }

    return majorityElement;
  }
}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

class Solution {
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}


class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;    
    }
}

class Solution {
  public int majorityElement(int[] nums) {
    int n = nums.length;

    int maxCount = 0;
    int index = -1;

    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }

      if (count > maxCount) {
        maxCount = count;
        index = i;
      }
    }

    return nums[index];
  }
}