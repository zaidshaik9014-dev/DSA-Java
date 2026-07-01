import java.util.Arrays;
public class ValidTriangleNumber {
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);

        int count = 0;

        for (int k = nums.length - 1; k >= 2; k--) {
            int left = 0, right = k - 1;

            while (left < right) {
                if (nums[left] + nums[right] > nums[k]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 4};

        System.out.println(triangleNumber(nums));
    }
}
