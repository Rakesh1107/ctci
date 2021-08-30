package arraysandstrings;

public class StringRotation {

    static boolean isRotation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int index1 = 0, index2 = word2.length()-1;
        while (index1 <= index2) {
            if (word1.charAt(index1) != word2.charAt(index2)) {
                return false;
            }
            index1++;
            index2--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "olkeh";
        System.out.println(isRotation(word1, word2));
    }
}
