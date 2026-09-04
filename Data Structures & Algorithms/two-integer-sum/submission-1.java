class Solution {
    public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> seen = new HashMap<>();

		if (nums.length <= 0) {
			return new int[] {};
		}

		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			if (seen.containsKey(target - v)) {
				return new int[] { seen.get(target - v), i };
			}
			seen.put(v, i);
		}
		
		return new int[] {};
	}
}
