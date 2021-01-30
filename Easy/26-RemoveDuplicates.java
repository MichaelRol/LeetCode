public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int curr = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[curr-1]) {
                nums[curr] = nums[i];
                curr++;
            }
        }
        return curr;
    }    
}
