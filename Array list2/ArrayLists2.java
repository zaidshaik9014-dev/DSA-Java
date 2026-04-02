import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists2 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Get element
        int value = list.get(0);
        System.out.println(value);

        // Add element at index
        list.add(1, 1);
        System.out.println(list);

        // Set element
        list.set(0, 5);
        System.out.println(list);

        // Remove element
        list.remove(3);
        System.out.println(list);

        // Size of list
        int size = list.size();
        System.out.println(size);

        // Traverse list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Sort list
        Collections.sort(list);
        System.out.println(list);
    }
}