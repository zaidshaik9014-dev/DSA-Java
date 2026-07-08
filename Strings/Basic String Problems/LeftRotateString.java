public class LeftRotateString {
    public static String leftRotate(String s, int k) {
        k = k % s.length();
        String first = s.substring(0, k);
        String sec = s.substring(k);

        return sec + first;
    }

    public static void main(String[] args) {
        String str = "ABCDE";
        int k = 2;
        System.out.println(leftRotate(str, k));
    }
}