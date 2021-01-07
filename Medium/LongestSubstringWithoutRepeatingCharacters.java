class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int max = 0;
        for (int i = 0; i < charArray.length; i++) {
            List<Character> subList = new ArrayList<Character>();
            subList.add(charArray[i]);
            for (int j = i+1; j < charArray.length; j++) {
                if (!subList.contains(charArray[j])) {
                    subList.add(charArray[j]);
                } else {
                    break;
                }
            }
            if (subList.size() > max) {
                max = subList.size();
            }
        }
        return max;
    }
}