import java.util.*;
public class lengthOfLongestSubstring {
    public static int lenLongSubStr(String s) {
        int left = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left)); {
                    left++;
                }
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";  // test input
        int result = lenLongSubStr(s);
        System.out.println("Longest substring length: " + result);
    }
}