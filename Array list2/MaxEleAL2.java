import java.util.ArrayList;
import java.util.Arrays;
class MaxEleAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 12, 3, 21, 8));
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}