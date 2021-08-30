package arraysandstrings;

import java.util.Arrays;

public class PermutationOfPalindrome {

    public static void main(String[] args) {
        String word = "tact coa";
        System.out.println(isPermutationOfPalindrome(word));
    }

    private static boolean isPermutationOfPalindrome(String word) {
        int len = word.length();
        int[] frequency = new int[26];

        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int num = Character.getNumericValue(c) - Character.getNumericValue('a');
                frequency[num]++;
            }
        }

        System.out.println(Arrays.toString(frequency));

        boolean oddFound = false;
        for (int j : frequency) {
            if (j % 2 == 1) {
                if (oddFound) {
                    return false;
                }
                oddFound = true;
            }
        }
        return true;


    }
}
