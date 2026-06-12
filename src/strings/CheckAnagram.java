package strings;
public class CheckAnagram { 

public static void run () {
        // String str1 = "listen";
        // String str2 = "silent";
        String str1 = "hello";
        String str2 = "world";

        System.out.println("Check Anagram Result:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        checkAnagram(str1, str2);
    }


     /*
    =========================================================
    QUESTION 7: Check Anagram
    =========================================================

    Problem:
    Check whether two strings are anagrams.

    Anagram means both strings contain same characters
    in different order.

    Example:
    Input:
    "listen"
    "silent"

    Output:
    Anagram
    */

    public static void checkAnagram(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}