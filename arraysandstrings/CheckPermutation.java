package arraysandstrings;

import java.util.Arrays;

public class CheckPermutation {

    private static String sort(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return Arrays.toString(array);
    }

    private static boolean isPermutation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        return sort(word1).equals(sort(word2));
    }

    public static void main(String[] args) {
        String word1 = "mate";
        String word2 = "team";
        System.out.println(isPermutation(word1, word2));
    }
}
