public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        Boolean found = false;
        while (!found) {
            if (l > r) {
                return l;
            }
            int m = (r + l)/2;
            if (target == nums[m]) {
                return m;
            } 
            if (target < nums[m]) {
                r = m-1;                
            } else if (target > nums[m]) {
                l = m+1;
            }
            
        }
        return 0;
    }
}
