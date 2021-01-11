class atoi {
    class Solution {
        public int myAtoi(String s) {
            int total = 0;
            boolean negative = false;
            boolean start = false;
            Map<Character, Integer> map =
                new HashMap<Character, Integer>();
            map.put('0', 0);
            map.put('1', 1);
            map.put('2', 2);
            map.put('3', 3);
            map.put('4', 4);
            map.put('5', 5);
            map.put('6', 6);
            map.put('7', 7);
            map.put('8', 8);
            map.put('9', 9);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ' && !start) {
                    continue;
                }
                if (s.charAt(i) == '-' && !start) {
                    negative = true;
                    start = true;
                    continue;
                }
                if (s.charAt(i) == '+' && !start) {
                    negative = false;
                    start = true;
                    continue;
                }
                if (map.containsKey(s.charAt(i))) {
                    if ((Integer.MAX_VALUE - map.get(s.charAt(i)))/10 < total) {
                        if (negative) {
                            return -2147483648;
                        }
                        return 2147483647;
                    }
                    total = total*10 + map.get(s.charAt(i));
                    start = true;
                    continue;
                }
                if (negative){
                    total = -total;
                }
                return total;
                
            }
            if (negative){
                total = -total;
            }
            return total;
            
        }
    }
}
