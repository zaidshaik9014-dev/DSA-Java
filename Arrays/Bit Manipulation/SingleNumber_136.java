public class SingleNumber_136 {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = singleNumber(nums);
        System.out.println("Single Number: " + ans);
    }
}