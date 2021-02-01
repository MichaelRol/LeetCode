class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x >= 0) {
            List nums = new ArrayList();
            while (x > 0) {
                int r = x % 10;
                nums.add(r);
                x = x / 10;
            }
            for (int i = 0; i < nums.size() / 2; i++) {
                if (nums.get(i) != nums.get(nums.size()-1 -i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
