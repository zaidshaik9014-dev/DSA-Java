public class QuickSort {
    public static int partition(int a[], int low, int high) {
        int pivot = a[high];//arrays last ele
        int i = low - 1;//which helps to track elements mt places < pivot to add small ele in that places

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;//it tracks empty spaces for placing ele < pivot
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
        return i;//pivot index
    }

    public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pidx = partition(a, low, high);//divide the array

            quickSort(a, low, pidx - 1);//sort ele < pivot
            quickSort(a, pidx + 1, high);//sort ele > pivot
        }
    }
    public static void main(String[] args) {
        int a[] = {6, 3, 9, 5, 2, 8};
        int n = a.length;

        quickSort(a, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
}