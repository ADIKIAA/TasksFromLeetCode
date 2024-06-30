package adik.tasksfromleetcode.tasksfromleetcode;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int y = height[left] < height[right] ? height[left] : height[right];

            maxArea = maxArea > (right - left) * y ? maxArea : (right - left) * y;;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
