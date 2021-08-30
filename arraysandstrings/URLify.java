package arraysandstrings;

public class URLify {

    private static String urlify(String word) {

        if (word == null || word.length() == 0) {
            return word;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "Mr Smith Goes to Washington";
        System.out.println(urlify(word));
    }
}
