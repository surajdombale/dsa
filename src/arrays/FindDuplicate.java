package arrays;

import java.util.HashSet;

public class FindDuplicate {    

     public static void run() {
        int[] arr = {1, 3, 4, 2, 5, 3};
        System.out.println("Running Find Duplicate Element...");
        findDuplicate(arr);
        System.out.println();
    }

    /*
    =========================================================
    QUESTION 4: Find Duplicate Element
    =========================================================

    Problem:
    Find the first duplicate element in the array.

    Example:
    Input:
    [1, 3, 4, 2, 5, 3]

    Output:
    3
    */

    public static void findDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println("Duplicate Element: " + num);
                return;
            }

            set.add(num);
        }

        System.out.println("No Duplicate Found");
    }

    

}