package strings;
public class RemoveSpace {
    public static void run() {
        String input = "  hello world  ";
        String result = removeSpaces(input);
        System.out.println("Remove Spaces Result:");
        System.out.println("Input: '" + input + "'");
        System.out.println("Output: '" + result + "'");
    }

    /*
    =========================================================
    QUESTION 5: Remove Spaces from String
    =========================================================

    Problem:
    Remove all spaces from the string.

    Example:
    Input:
    "  hello world  "

    Output:
    "helloworld"
    */

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }
}