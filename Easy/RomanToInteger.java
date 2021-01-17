public class RomanToInteger {
    public int romanToInt(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return getValue(s.charAt(0));
        }
        int first = getValue(s.charAt(0));
        int second = getValue(s.charAt(1));
        if (first < second) {
            return (second - first) + romanToInt(s.substring(2));
        } else {
            return first + romanToInt(s.substring(1));
        }
    }
    
    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
                
        }
    }
}
