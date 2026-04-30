import java.util.*;
public class LengthofLastWord {
    public static int length(String s) {
        String str = s.trim();
        int count = 0 ;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') count++;
            else break;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(length(s));
    }
}