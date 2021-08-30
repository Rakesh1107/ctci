package arraysandstrings;

import java.util.Arrays;

public class IsUnique {

    private static boolean isUnique(String word) {
        if (word.length() > 128) return false;

        boolean[] array = new boolean[128];

        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i);
            if (array[c]) {
                return false;
            }
            array[c] = true;
        }

        return true;
    }

    private static boolean isUnique2(String word) {
        if (word.length() > 128) return false;

        char[] array = word.toCharArray();
        Arrays.sort(array);

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "developer";
        System.out.println(isUnique(word));
        System.out.println(isUnique2(word));
    }
}
