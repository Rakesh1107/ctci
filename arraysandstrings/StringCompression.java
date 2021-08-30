package arraysandstrings;

public class StringCompression {

    private static String compressString(String word) {
        if (word == null || word.length() == 0) return word;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length()-1; i++) {
            char c = word.charAt(i);
            int count = 1;
            while (i < word.length()-1 && word.charAt(i) == word.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(c).append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "aaabbccdddeeee";
        System.out.println(compressString(word));
    }
}
