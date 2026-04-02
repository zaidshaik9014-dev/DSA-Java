import java.util.ArrayList;
import java.util.Arrays;
public class ReplaceNegativeAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 2, 3, 0, -10));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, 0);
            }
        }

        System.out.println(list);
    }
}