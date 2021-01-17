public class RegExMatching {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        if (s.isEmpty()) {
            if (p.length() >= 2 && p.charAt(1) == '*') {
                return isMatch(s, p.substring(2));
            } else {
                return false;
            }
        } else {
            if (p.length() >= 2 && p.charAt(1) == '*') {
                if (match(s.charAt(0), p.charAt(0))) {
                    if (isMatch(s, p.substring(2))) {
                        return true;
                    }
                    return isMatch(s.substring(1), p);
                } else {
                    return isMatch(s, p.substring(2));
              }
            } else {
                if (match(s.charAt(0), p.charAt(0))) {
                    return isMatch(s.substring(1), p.substring(1));
                } else {
                    return false;
                }
            }
        }
    }
    
    public boolean match(char s, char p) {
        if (p == '.') {
            return true;
        }
        if (s == p) {
            return true;
        }
        return false;
    }    
}
