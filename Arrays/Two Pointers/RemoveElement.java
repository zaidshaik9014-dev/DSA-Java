public class RemoveElement {
    public static int removeEle(int[] a, int val) {
        int left = 0;
         
        for (int right = 0; right < a.length; right++) {
            if (a[right] != val) {
                a[left] = a[right];
                left++;
            }
        }

        return left;
    }
    public static void main(String[] args) {
         int[] arr = {3, 2, 2, 3};

        int len = removeEle(arr, 3);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}