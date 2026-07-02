public class CountVowelsConsonants {
    public static void count(String s) {
        int vow = 0, con = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vow++;

                } else {

                    con++;
                }
            }
        }

        System.out.println("Vowels: " + vow);
        System.out.println("COnsonants: " + con);
    }

    public static void main(String[] args) {
        String s = "Programming";
        count(s);
    }
}