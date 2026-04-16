public class InsertionSort {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];   // element to insert
            int j = i - 1;     // start from left side

            while (j >= 0 && a[j] > curr) {
                a[j + 1] = a[j];  // shift right
                j--;
            }

            a[j + 1] = curr;  // place element
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 5, 6};

        insertionSort(a);

        // basic for loop instead of for-each
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}