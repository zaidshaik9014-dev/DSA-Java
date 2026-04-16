public class CountPairs {
    //Count Pairs Less Than Target
    public static int countPairs(int[] a, int target) {
        int left = 0, right = a.length - 1, count = 0;

        while (left < right) {
            if (a[left] + a[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(countPairs(arr, 7));
    }
}