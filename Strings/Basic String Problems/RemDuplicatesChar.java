import java.util.HashSet;
public class RemDuplicatesChar {
    public static String remDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String s = "programming";

        System.out.println(remDuplicates(s));
    }
}