public class RevEveryWordL1 {
    public static String revWords(String s) {
        String[] words = s.split("\\s+");

        StringBuilder res = new StringBuilder();

        for (String word : words) {
            res.append(new StringBuilder(word).reverse()).append(" ");
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {

        String s = "I Love Java";

        System.out.println(revWords(s));

    }
}