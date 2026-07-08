public class JumpGameDemo {
    public static void demo(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("----------------");

            System.out.println("Current Index : " + i);
            System.out.println("Current Reach : " + maxReach);

            if (i > maxReach) {
                System.out.println("Cannot reach index " + i);
                return;
            }

            maxReach =  Math.max(maxReach, i + nums[i]);

            System.out.println("Updated Reach : " + maxReach);
        }
    }

    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};

        demo(nums);
    }
}