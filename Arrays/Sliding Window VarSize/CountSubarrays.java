public class CountSubarrays {
    //Count Subarrays with Sum ≤ K
    public static int countSubarrays(int[] a, int k) {
        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < a.length; right++) {
            sum += a[right];

            while (sum > k) {
                sum -= a[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 0, 1};
        int k = 3;

        System.out.println(countSubarrays(a, k));
    }
}