package strings;

public class CountWords {
    public static void run() {
        String input = "hello world";
        int count = countWords(input);
        System.out.println("Count Words Result:");
        System.out.println("Input: " + input);
        System.out.println("Word Count: " + count);
    }

    /*
    =========================================================
    QUESTION 4: Count Words in String
    =========================================================

    Problem:
    Count number of words in a sentence.

    Example:
    Input:
    "Java is awesome"

    Output:
    3
    */

    public static int countWords(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
}