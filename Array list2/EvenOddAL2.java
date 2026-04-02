import java.util.ArrayList;
import java.util.Arrays;
public class EvenOddAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        int even = 0, odd = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) even++;
            else odd++;
        }

        System.out.println(even);
        System.out.println(odd);
    }
}