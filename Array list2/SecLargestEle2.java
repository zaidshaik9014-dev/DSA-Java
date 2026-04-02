import java.util.ArrayList;
import java.util.Arrays;

public class SecLargestEle2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5, 30, 25));
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println(second);
    }
}