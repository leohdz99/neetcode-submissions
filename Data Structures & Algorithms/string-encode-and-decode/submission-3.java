class Solution {

    public String encode(List<String> strs) {
		if (strs.isEmpty())
			return "";

		String separator = "#//#";
		String delimiter = "#-,-#";
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < strs.size(); i++) {
			builder.append(strs.get(i).length()).append(delimiter).append(strs.get(i));
			if (i != strs.size() - 1) {
				builder.append(separator);
			}
		}

		return builder.toString();
	}

	public List<String> decode(String str) {

		if (str.isEmpty())
			return List.of();
		String separator = "#\\/\\/#";
		
		String[] mainArr = str.split(separator);
		List<String> result = new ArrayList<>();
		
		for (String s : mainArr) {
			String delimiter = "#-,-#";
			String[] auxArr = s.split(delimiter);
			int len = Integer.parseInt(auxArr[0]);

			if (len == 0 ) {
				result.add("");
			} else {
				result.add(auxArr[1]);
			}
		}

		return result;
	}
}
