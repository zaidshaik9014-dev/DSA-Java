import java.util.HashMap;
public class CharacterFreq {
    public static void freq(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }
    
    public static void main(String[] args) {
        String s = "banana";
        freq(s);
    }
}