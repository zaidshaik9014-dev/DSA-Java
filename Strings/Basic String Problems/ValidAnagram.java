import java.util.Arrays;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return (Arrays.equals(a1, a2) ? true : false);
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println("Are they anagrams? " + result);
    }
}