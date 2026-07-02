public class ReverseStringL3 {
    public static String revWords(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
         while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }

            int start = i;

            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }

            int end = i - 1;

            while (end >= start) {
                res.append(s.charAt(end));
                end--;
            }

            if (i < s.length()) {
                res.append(" ");
            }
        }

        return res.toString().trim(); 
    }

    public static void main(String[] args) {

        String s = "I Love Java";

        System.out.println(revWords(s));

    }
}