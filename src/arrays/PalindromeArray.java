package arrays;

public class PalindromeArray {

    public static void run() {
        int[] arr = {1, 2, 3, 2, 1};
        boolean isPalindrome = checkPalindromeArray(arr);
        System.out.println("Is Palindrome Array: " + isPalindrome);
    }

        /*
    =========================================================
    QUESTION 3: Check if Array is Palindrome
    =========================================================

    Problem:
    Check whether the array is palindrome or not.

    Example:
    Input:
    [1, 2, 3, 2, 1]

    Output:
    Palindrome
    */

    public static Boolean checkPalindromeArray(int [] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}