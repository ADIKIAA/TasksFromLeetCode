package adik.tasksfromleetcode.taskfromjob4j;

import java.util.Arrays;

public class SmallestRangeFinder {

    public static int[] findSmallestRange(int[] nums, int k) {

        int[] result = new int[2];

        int s = 0;
        int i = 0;

        while (i < nums.length) {
            if (s == i) {
                result[0] = i;
                i++;
                continue;
            }

            if (nums[s] != nums[i]) {
                s = i;
                i++;
            } else {
                s = i;
            }

            if (i - result[0] == k) {
                result[1] = s;
                return result;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 3, 5, 6, 7, 9};
        int k = 3;
        int[] result = findSmallestRange(nums, k);
        if (result != null) {
            System.out.println("Наименьший диапазон с " + k + " различными элементами: " + Arrays.toString(result));
        } else {
            System.out.println("Такой диапазон не существует.");
        }
    }

}
