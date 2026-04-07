import java.util.*;

class LL1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        list.addLast("List");
        System.out.println(list);
        
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }

        System.out.println("null");
        
        list.remove(3);
        System.out.println(list);
    }
}