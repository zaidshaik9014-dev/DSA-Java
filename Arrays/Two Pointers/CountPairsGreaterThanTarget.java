public class CountPairsGreaterThanTarget {
    public static int countpairs(int[] nums,int target) {
        int left = 0, right = nums.length - 1, count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum > target) {
                count += right - left;
                right--;
            } else {
                left++;
            }
        }

        return  count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(countpairs(nums, 6));
    }
}