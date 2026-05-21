package strings;

public class PalindromeString {

    public static void run() {

        String input = "madam";

        boolean result = isPalindrome(input);

        System.out.println("Input: " + input);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}