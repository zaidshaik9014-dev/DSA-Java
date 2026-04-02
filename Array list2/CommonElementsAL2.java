import java.util.ArrayList;
import java.util.Arrays;
public class CommonElementsAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 4, 6));

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                result.add(list1.get(i));
            }
        }

        System.out.println(result);
    }
}