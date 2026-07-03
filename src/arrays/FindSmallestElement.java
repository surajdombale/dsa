package arrays;

public class FindSmallestElement {    

     public static void run() {
        int[] arr = {5, 3, 4, 2, 1};
        System.out.println("Running Find Smallest Element...");
        findSmallest(arr);
        System.out.println();
    }

    /*
    =========================================================
    QUESTION 5: Find Smallest Element
    =========================================================

    Problem:
    Find the smallest element in the array.

    Example:
    Input:
    [5, 3, 4, 2, 1]

    Output:
    1
    */

    public static void findSmallest(int[] arr) {

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int smallest = arr[0];

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Smallest Element: " + smallest);
    }

} 