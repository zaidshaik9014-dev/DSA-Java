public class ToggleCase {
    public static String toggle(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                res.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                res.append(Character.toUpperCase(ch));
            } else {
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String s = "Java123@#";

        System.out.println(toggle(s));
    }
}