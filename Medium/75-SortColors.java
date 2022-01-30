public class SortColors {
  public static void main(String[] args) {
    int[] A = {0, 0, 0, 0};
    for (int a : sortColors(A)) {
      System.out.println(a);
    }
  }

  public static int[] sortColors(int[] nums) {
    int point0 = 0;
    int point2 = nums.length - 1;
    while (point0 < nums.length && nums[point0] == 0) {
      point0++;
    }
    while (point2 > 0 && nums[point2] == 2) {
      point2--;
    }
    int curr = point0;
    while (curr <= point2 && point2 > 0) {
      if (nums[curr] == 0) {
        nums[curr] = nums[point0];
        nums[point0] = 0;
      }
      if (nums[curr] == 2) {
        nums[curr] = nums[point2];
        nums[point2] = 2;
      }

      while (point0 < nums.length && nums[point0] == 0) {
        point0++;
      }
      while (point2 > 0 && nums[point2] == 2) {
        point2--;
      }

      if (curr < point0) {
        curr = point0;
      } else if (nums[curr] == 1) {
        curr++;
      }
    }
    return nums;
  }
}
