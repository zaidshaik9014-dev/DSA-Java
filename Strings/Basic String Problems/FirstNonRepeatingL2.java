public class FirstNonRepeatingL2 {
    public static char firstNOnRepeating(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println(firstNOnRepeating(s));
    }
}