package strings;
public class FindDuplicateCharacters {


    public static void run() {
        System.out.println("Find Duplicate Characters Result:");
        findDuplicateCharacters("programming");
    }


        /*
    =========================================================
    QUESTION 6: Find Duplicate Characters
    =========================================================

    Problem:
    Find duplicate characters in a string.

    Example:
    Input:
    "programming"

    Output:
    r
    g
    m
    */

    public static void findDuplicateCharacters(String str) {

        char[] arr = str.toCharArray();

        System.out.println("Duplicate Characters For String '" + str + "':");

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }

            if (count > 1 && arr[i] != '0') {
                System.out.println(arr[i]);
            }
        }
    }
}
