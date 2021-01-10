class ReverseInteger {
    public int reverse(int x) {
        char[] intAsChars = ("" + x).toCharArray();
        boolean neg = false;
        int answer = 0;
        String newString = "";
        if (intAsChars[0] == '-') {
            neg = true;
            newString = String.valueOf(x).substring(1);
        } else{
            newString = String.valueOf(x);
        }
        for (int i = newString.length() - 1; i >= 0; i--) {
            int a = Character.getNumericValue(newString.charAt(i)); 
            answer += a * Math.pow(10, i);
        }
        if (answer == Math.pow(2, 31) - 1) {
            return 0;
        }
        if (neg) {
            answer = -answer;
        }

        return answer;
    }
}
