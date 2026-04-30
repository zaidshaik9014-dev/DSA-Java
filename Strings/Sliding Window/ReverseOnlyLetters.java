import java.util.*;
public class ReverseOnlyLetters {
    public static String revOnlyLetters(String s) {
        int start = 0, end = s.length() - 1;
        char[] ch = s.toCharArray();

        while (start < end) {
            if (!Character.isLetter(ch[start])) {
                start++;
            } else if (!Character.isLetter(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end--;
            }
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        //a-bC-dEf-ghIj
        String result = revOnlyLetters(input);

        System.out.println("Result: " + result);

        sc.close();
    }
}