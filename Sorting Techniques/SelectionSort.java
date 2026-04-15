//1. Find the smallest element in the unsorted part and put it in the correct position.
//2. Repeat this for each position from left to right until sorted.
public class SelectionSort {

    public static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the smallest element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with first element
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};

        selectionSort(a);

        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}