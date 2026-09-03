class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> occurrences = new HashMap<>();

			if (s.length() != t.length()) {
				return false;
			}

			for (int i = 0; i < s.length(); i++) {
				char letterWord1 = s.charAt(i);
				char letterWord2 = t.charAt(i);

				occurrences.put(String.valueOf(letterWord1), occurrences.getOrDefault(String.valueOf(letterWord1), 0) + 1);
				occurrences.put(String.valueOf(letterWord2), occurrences.getOrDefault(String.valueOf(letterWord2), 0) - 1);
			}

			for (int value : occurrences.values()) {
				if (value != 0) {
					return false;
				}
			}

			return true;
    }
}
