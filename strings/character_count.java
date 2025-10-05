import java.util.HashMap;
import java.util.Map;

public class character_count {
    public void countFreq(String s) {
        // Step 1: Create a HashMap
        HashMap<Character, Integer> freq = new HashMap<>();

        // Step 2: Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character already exists, increment count
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                // If character not present, put it with count 1
                freq.put(ch, 1);
            }
        }

        // Step 3: Print frequencies
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String s = "sivaganesh";
        character_count obj = new character_count();
        obj.countFreq(s);
    }
}
