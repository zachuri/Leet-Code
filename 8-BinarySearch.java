class Solution {
    public int search(int[] nums, int target) {
		int fail = -1;


		int beg = 0, end = nums.length - 1, middle = (beg + end) / 2;


		while (beg <= end) {
			if (nums[middle] == target) {
				return middle;
			}
			if (nums[middle] > target) {
				end = middle - 1;
				middle = (end + beg) / 2;
			}
			if (nums[middle] < target) {
				beg = middle + 1;
				middle = (end + beg) / 2;
			}
		}

		return fail;
    }
}

// time complexity: o(logn) space: o(n)
