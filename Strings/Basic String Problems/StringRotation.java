public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String temp = s1 + s2;
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        if (isRotation(str1, str2))
            System.out.println("Strings are rotations.");
        else
            System.out.println("Strings are not rotations.");
    }
}