
import java.util.Scanner;

public class LongestSubarraySumLessThanK {
    public static int longest(int[] a, int k) {
        int left = 0,  sum = 0, maxLength = 0;

        for (int right = 0; right < a.length; right++) {
            sum += a[right];

            while (sum > k) {
                sum -= a[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.print(longest(a, k));
    }
}