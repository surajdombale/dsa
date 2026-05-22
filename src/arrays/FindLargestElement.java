   package arrays;
public class FindLargestElement {
     public static void run() {
        findLargestElement();
    }

    /*QUESTION 1: Find Largest Element in Array
    =========================================================

    Problem:
    Given an array of integers, find the largest element.

    Example:
    Input:
    [10, 45, 2, 99, 23]

    Output:
    99
    */

    public static void findLargestElement() {

        int[] arr = {10, 45, 2, 99, 23};

        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest Element: " + largest);
    }
}
