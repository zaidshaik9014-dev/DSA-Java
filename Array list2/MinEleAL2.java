import java.util.ArrayList;
import java.util.Arrays;
public class MinEleAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 5, 6, 7, -1));
        
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println(min);
    }
}