import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));

        boolean isPalindrome = true;

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(isPalindrome);
    }
}