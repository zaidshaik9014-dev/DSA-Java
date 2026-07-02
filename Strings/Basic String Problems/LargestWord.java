public class LargestWord {
    public static String largestWord(String s) {
        String[] words = s.split("\\s+");
        String largest = "";

        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        String s = "I Love Competitive Programming";

        System.out.println(largestWord(s) + " " + largestWord(s).length());

    }
}