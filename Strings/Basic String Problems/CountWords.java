public class CountWords {
    public static int countwords(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        String[] words = s.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String s = "  I    Love java";
        System.out.println(countwords(s));
    }
}