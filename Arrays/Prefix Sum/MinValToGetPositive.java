public class MinValToGetPositive {
    public static int minStartValue(int[] nums) {
        int sum = 0, minSum = 0;

        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }

        return 1 - minSum;
    }

    public static void main(String[] args) {
        int[] nums = {-3, 2, -3, 4, 2};

        System.out.println(minStartValue(nums));
    }
}