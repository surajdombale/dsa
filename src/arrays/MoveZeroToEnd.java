package arrays;

import java.util.Arrays;

public class MoveZeroToEnd {    

        public static void run() {
            int[] arr = {0, 1, 0, 3, 12};
            System.out.println("Running Move Zeros to End...");
            moveZerosToEnd(arr);
            System.out.println();
        }       


 /*
    =========================================================
    QUESTION 5: Move All Zeros to End
    =========================================================

    Problem:
    Move all zeros to the end while maintaining
    the order of non-zero elements.

    Example:
    Input:
    [0, 1, 0, 3, 12]

    Output:
    [1, 3, 12, 0, 0]
    */

    public static void moveZerosToEnd(int[] arr) {

        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println("Updated Array: " + Arrays.toString(arr));
    }
}