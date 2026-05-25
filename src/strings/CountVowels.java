package strings;

public class CountVowels {

   public static void run() {
        String input = "hello world";
        int count = countVowels(input);

        System.out.println("Count Vowels Result:");
        System.out.println("Input: " + input);
        System.out.println("Vowel Count: " + count);
        System.out.println();
    }

        /*
    =========================================================
    QUESTION 3: Count Vowels in String
    =========================================================

    Problem:
    Count total vowels in the string.

    Example:
    Input:
    "programming"

    Output:
    3
    */

    public static int countVowels(String str) {

        str = str.toLowerCase();
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                count++;
            }
        }
        return count;

    }

}