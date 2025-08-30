package two_pointers;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int newLength = removeDuplicates(arr);

        int[] result = Arrays.copyOf(arr, newLength);
        System.out.println(Arrays.toString(result));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
