public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args) {
        String s = "mAdam";
        System.out.println(isPalindrome(s));
    }
}