
public class PairWithDiff {
    public static int[] findPair(int[] arr, int k) {
        int left = 0, right = 1;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];

            if (diff == k && left != right) {
                return new int[]{left, right};
            } else if (diff < k) {
                right++;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        int[] result = findPair(arr, 4);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}