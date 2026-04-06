import java.util.Scanner;

public class MergeSort1 {
    public static void conquer1(int a[], int si, int mid, int ei) {
        int merged1[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (a[idx1] <= a[idx2]) {
                merged1[x++] = a[idx1++];
            } else {
                merged1[x++] = a[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged1[x++] = a[idx1++];
        }

        while (idx2 <= ei) {
            merged1[x++] = a[idx2++];
        }

        for (int i = 0, j = si; i < merged1.length; i++, j++) {
            a[j] = merged1[i];
        }
    }
    public static void divide1(int a[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        
        divide1(a, si, mid);
        divide1(a, mid + 1, ei);
        conquer1(a, si, mid, ei);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        divide1(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}