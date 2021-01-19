public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) { return ""; }
        StringBuilder str = new StringBuilder();
        int shortest = 200;
        for (String s: strs) {
            if (s.length() < shortest) {
                shortest = s.length();
            }
        }
        for (int i = 0; i < shortest; i++) {
            char c = strs[0].charAt(i);
            for (String string: strs) {
                c = strs[0].charAt(i);
                if (string.charAt(i) != c) {
                    return str.toString();
                }
            }
            str.append(c);
        }
        return str.toString();
    }
}
