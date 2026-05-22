package arrays;
import java.util.Arrays;
public class ReverseArray {
     public static void run() {
        reverseArray();
    }
  /*
    =========================================================
    QUESTION 2: Reverse an Array
    =========================================================

    Problem:
    Reverse the given array.

    Example:
    Input:
    [1, 2, 3, 4, 5]

    Output:
    [5, 4, 3, 2, 1]
    */

    public static void reverseArray() {

        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}