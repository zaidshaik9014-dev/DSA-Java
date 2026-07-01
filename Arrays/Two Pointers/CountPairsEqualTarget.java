public class CountPairsEqualTarget {
    public static int countPairs(int[] nums, int target) {
        int left = 0, right = nums.length - 1, count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        
        System.out.println(countPairs(nums, 6));
    }
}