import java.util.ArrayList;
import java.util.Arrays;
public class MoveZerosAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 0, 3, 4, 5));

        ArrayList<Integer> result = new ArrayList<>();

        //add non zero ele
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                result.add(list.get(i));
            }
        }

        // add zeros
        for (int i = 0 ;i < list.size(); i++) {
            if ( list.get(i) == 0) {
                result.add(0);
            }
        }

        System.out.println(result);
    }
}