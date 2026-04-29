public class FindTheDifference {
    public static char diff(String s, String t) {
        char res = 0;
        for (int i = 0; i < s.length(); i++) {
            res ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            res ^= t.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(diff(s, t));
    }
}