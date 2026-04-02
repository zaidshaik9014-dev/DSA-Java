import java.util.ArrayList;
import java.util.Arrays;
public class MergeListsAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(0, 2, 4, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));

        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(list1);
        result.addAll(list2);

        System.out.println(result);
    }
}