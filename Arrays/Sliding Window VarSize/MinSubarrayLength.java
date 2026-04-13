public class MinSubarrayLength {
// Find the minimum length of a contiguous subarray where the sum is greater than or equal to the target value.
    public static int minSubArrayLen(int[] a,int target) {
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < a.length; right++) {
            sum += a[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= a[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(minSubArrayLen(a, target));
    }
}