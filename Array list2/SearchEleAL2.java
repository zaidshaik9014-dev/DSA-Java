import java.util.ArrayList;
import java.util.Arrays;
public class SearchEleAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        int key = 20;
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                found =  true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not found");
    }
}