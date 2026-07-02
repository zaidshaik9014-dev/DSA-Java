public class CountCharacters {
    public static void count(String s) {
        int letters = 0, dig = 0, spa = 0, spl = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                dig++;
            } else if (Character.isWhitespace(ch)) {
                spa++;
            } else {
                spl++;
            }
        }

        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + dig);
        System.out.println("Spaces = " + spa);
        System.out.println("Special Characters = " + spl);
    }

    public static void main(String[] args) {

        String s = "Java 123 @2026!";

        count(s);
    }
}