public class ContainerWithMostWater {
    // Much faster, looked at answer before I wrote it though.
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l != r) {
            int area;
            if (height[l] > height[r]) {
                area = height[r] * (r-l);
                r--;
            } else {
                area = height[l] * (r-l);
                l++;
            }
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    // My first attempt, OK but a bit slow.
    public int maxAreaOG(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j-i);
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }
}
