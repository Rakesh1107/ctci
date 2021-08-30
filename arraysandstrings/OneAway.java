package arraysandstrings;

public class OneAway {
    private static boolean isOneAway(String word1, String word2) {

        if (Math.abs(word1.length() - word2.length()) > 1) {
            return false;
        }

        String s1 = word1.length() > word2.length() ? word1 : word2;
        String s2 = word1.length() > word2.length() ? word2 : word1;

        int index1 = 0, index2 = 0;
        boolean foundDifference = false;

        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;

                if (s1.length() == s2.length()) {
                    index2++;
                }
            } else {
                index2++;
            }
            index1++;
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "apli";
        System.out.println(isOneAway(word1, word2));
    }
}
