public class FirstNegativeNoQueue {
    public static void printFirstNegetive(int[] a, int k) {
        for (int i = 0; i <= a.length - k; i++) {
            boolean found = false;

            for (int j = i; j < i + k; j++) { //i + k --> for sliding thw window
                if (a[j] < 0) {
                    System.out.print(a[j] + " ");
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.print("0 ");
            }
        }
    }
        public static void main(String[] args) {
        int[] a = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        printFirstNegetive(a, k);
    }
}