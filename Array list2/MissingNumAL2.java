import java.util.ArrayList;
import java.util.Arrays;
public class MissingNumAL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6));
        
        int n = list.size() + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < list.size(); i++) {
            actualSum += list.get(i);
        }

        int missingNum = expectedSum - actualSum;

        System.out.println(missingNum);
    }    
}