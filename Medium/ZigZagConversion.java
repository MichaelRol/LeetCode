class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] strings = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            strings[i] = "";
        }
        int index = 0;
        int invert = 1;
        for (int i = 0; i < s.length(); i++) {
            strings[index] += s.charAt(i);
            if (index + invert < 0 || index + invert >= numRows) {
                invert *= -1;
            }
            index += invert;
        }
        String answer = "";
        for (String sub : strings) {
            answer += sub;
        }
        return answer;
    }
}
