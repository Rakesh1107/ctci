package arraysandstrings;

public class ReverseString {
    static void swap(char[] array, int i, int j) {
        char c = array[i];
        array[i] = array[j];
        array[j] = c;
    }

    static String reverseString(String word) {
        if (word == null || word.length() == 0) {
            return word;
        }

        char[] array = word.toCharArray();

        int start = 0, end = array.length-1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
        return new String(array);
    }

    public static void main(String[] args) {
        String word = null;
        System.out.println(reverseString(word));
    }
}
