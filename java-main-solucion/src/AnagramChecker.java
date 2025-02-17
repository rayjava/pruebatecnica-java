import java.util.Arrays;
public class AnagramChecker {

    public static boolean areAnagrams(String word1, String word2) {

        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        char[] arreglo1 = word1.toCharArray();
        char[] arreglo2 = word2.toCharArray();

        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        return Arrays.equals(arreglo1, arreglo2);
    }

}
