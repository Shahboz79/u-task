package two_sums;

public class TwoSums {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8};
        int target = 11;

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("not found");
    }
}
