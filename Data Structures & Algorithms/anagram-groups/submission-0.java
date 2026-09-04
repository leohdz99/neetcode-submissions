class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> solution = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String s: strs) {
			char[] a = s.toCharArray();
			Arrays.sort(a);
			String k = String.valueOf(a);
			if (map.containsKey(k)) {
				map.get(k).add(s);
			} else {
				List<String> v = new ArrayList<>();
				v.add(s);
				map.put(k, v);
			}
		}

		map.forEach((k, v) -> solution.add(v));

		return solution;
    }
}
