import java.util.ArrayList;
class SumOfEleAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}