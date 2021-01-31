public class RemoveElement {
    // Checks if each element equals val, if so, replaces that element with the end value
    // Then checks that the element moved in is equal to val and repeats process.
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                nums[i] = nums[len-1];
                i--;
                len--;
            }
        }
        return len;
    }
}
