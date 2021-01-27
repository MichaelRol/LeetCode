class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        if (s == "[]" || s == "{}" || s == "()" || s.isEmpty()) {
            return true;
        }
        int bracketCount = 1;
        char bracketType = s.charAt(0);
        if (!(bracketType == '{' || bracketType == '(' || bracketType == '[')){
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == bracketType) {
                bracketCount++;
            }
            if (s.charAt(i) == reverse(bracketType)){
                bracketCount--;
            }
            if (bracketCount == 0) {
                if (i == s.length() - 1) {
                    return isValid(s.substring(1, i));
                } else {
                    return isValid(s.substring(1, i)) && isValid(s.substring(i+1));
                }
            }
        }
        return false;
    }
    public char reverse(char bracket) {
        if (bracket == '(') {
            return ')';
        }
        if (bracket == '{') {
            return '}';
        }
        if (bracket == '[') {
            return ']';
        }
        return ' ';
    }
}