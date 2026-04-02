import java.util.ArrayList;
import java.util.Arrays;
public class SumEvenAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 0, -1, -8));

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                sum += list.get(i);
            }
        }

        System.out.println(sum);
    }
}