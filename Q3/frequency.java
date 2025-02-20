package Q3;

import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        String input = "This is a test string. This string is for testing";
        String[] words = input.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
