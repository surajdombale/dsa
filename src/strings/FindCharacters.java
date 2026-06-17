package strings;


public class FindCharacters {

    public static void run() {
        String input = "hello world";
        char targetChar = 'o';
        int count = findCharacterCount(input, targetChar);

        System.out.println("Find Characters Result:");
        System.out.println("Input: " + input);
        System.out.println("Target Character: " + targetChar);
        System.out.println("Count: " + count);
        System.out.println();
    }

    /*
    =========================================================
    QUESTION 4: Find Characters in String
    =========================================================

    Problem:
    Count total occurrences of a specific character in the string.

    Example:
    Input:
    "hello world", 'o'

    Output:
    2
    */

    public static int findCharacterCount(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}   