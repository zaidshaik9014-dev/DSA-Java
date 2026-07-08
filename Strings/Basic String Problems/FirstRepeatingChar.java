public class FirstRepeatingChar {
    public static char firstRepeating(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch] == 1) {
                return ch;
            }
            freq[ch]++;
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "programming";
        char ans = firstRepeating(str);
        if (ans == '\0')
            System.out.println("No repeating character.");
        else
            System.out.println("First Repeating Character: " + ans);
    }
}