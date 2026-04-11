public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        int idx = 0;
        for (int i = 0; i < n - k; i++) {
            int max = nums[i];
            
            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }

            result[idx++] = max;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);

        for (int val : res) {
            System.out.print(val + " ");
        }

    }    
}//takes a lot of time