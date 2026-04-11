
import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String s = "abcdabcbb";
        int start = 0, end = 0, maxLength = 0;
        List<Character> list = new ArrayList<>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        System.out.println(maxLength);
    }
}