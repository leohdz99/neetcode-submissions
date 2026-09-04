class Solution {
    public int[] twoSum(int[] nums, int target) {

		

		if (nums.length <= 0) {
			return new int[] {};
		}
        Map<Integer, Integer> seen = new HashMap<>();
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
