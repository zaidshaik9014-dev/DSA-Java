public class MaxReach {
    public static int maxReach(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                break;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return maxReach;
    }

    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};

        System.out.println(maxReach(nums));
    }
}