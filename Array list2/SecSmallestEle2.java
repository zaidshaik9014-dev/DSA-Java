import java.util.ArrayList;
import java.util.Arrays;

public class SecSmallestEle2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 8, 3, -1));
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }

        System.out.println(second + " " + first);
    }
}