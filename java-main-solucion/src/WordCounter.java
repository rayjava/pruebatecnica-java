import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {

    public static Map<String, Integer> countWords(String text) {
      /*  Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }*/
        return Stream.of(text.split("\\s+"))
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
    }
}
