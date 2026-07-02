public class ReverseWordsInString {
    public static String revWords(String s) {
        String[] words = s.trim().split("\\s+");
        int left = 0, right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {

        String s = "  hello   world  ";

        System.out.println("Original String:");
        System.out.println("\"" + s + "\"");

        String result = revWords(s);

        System.out.println("\nReversed String:");
        System.out.println("\"" + result + "\"");
    }
}