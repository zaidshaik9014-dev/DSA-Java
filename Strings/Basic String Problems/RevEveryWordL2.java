public class RevEveryWordL2 {
    public static String revWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                res.append(word.charAt(i));
            }
            res.append(" ");
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {

        String s = "I Love Java";

        System.out.println(revWords(s));

    }
}