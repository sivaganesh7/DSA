import java.util.*;
public class freq_count {
    public Map<Integer, Integer> countFrequencies(int[] a) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        freq_count fc = new freq_count();
        int[] a = {1, 2, 2, 3, 3, 3, 4};
        Map<Integer, Integer> frequencies = fc.countFrequencies(a);
        System.out.println(frequencies); // Output: {1=1, 2=2, 3=3, 4=1}
    }
}
