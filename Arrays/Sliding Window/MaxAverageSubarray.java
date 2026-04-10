public class MaxAverageSubarray {
    public static double maxAverage(int[] a, int k) {
        if (a == null || a.length == 0 || k > a.length) {
            return 0.0;
        }
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        int mSum = sum;
        for (int i = k; i < a.length; i++) {
            sum = sum - a[i - k] + a[i];
            mSum = Math.max(mSum, sum);
        }

        return (double) mSum / k;
    }
    public static void main(String[] args) {
        int[] a = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(maxAverage(a, k));
    }
}