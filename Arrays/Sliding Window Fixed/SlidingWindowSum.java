public class SlidingWindowSum {
    public static void subArraysSum(int[]a , int k) {

        int wSum = 0;
        for (int i = 0; i < k; i++) {
            wSum += a[i];
        }
        System.out.print(wSum + " ");

        for (int i = k; i < a.length; i++) {
            wSum = wSum - a[i - k] + a[i];
            System.out.print(wSum + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 2, 9, 7, 1};
        int k = 3;

        subArraysSum(a, k);
    }
} 