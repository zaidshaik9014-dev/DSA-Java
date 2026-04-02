import java.util.ArrayList;
import java.util.Arrays;
class RemDuplAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }

        System.out.println(result);
    }
}