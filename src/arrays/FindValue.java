package arrays;

public class FindValue {

    public static void run() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = findValue(arr, target);

        System.out.println("Find Value Result:");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target Value: " + target);
        System.out.println("Found: " + found);
        System.out.println();
    }

    /*
    =========================================================
    QUESTION 5: Find Value in Array
    =========================================================

    Problem:
    Check if a specific value exists in the array.

    Example:
    Input:
    [1, 2, 3, 4, 5], 3

    Output:
    true
    */

    public static boolean findValue(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}