
import java.util.Scanner;

public class QuickSort1 {
    public static int partition1(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i;
    }
    public static void quickSort1(int a[], int low, int high) {
        if (low < high) {
            int pidx = partition1(a, low, high);

            quickSort1(a, low, pidx - 1);
            quickSort1(a, pidx + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        quickSort1(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}