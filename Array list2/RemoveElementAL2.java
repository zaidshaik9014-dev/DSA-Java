import java.util.ArrayList;
import java.util.Arrays;
public class RemoveElementAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4));
        int key = 3;
         for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}