package strings;

public class ReverseString {

    public static void run() {
        String input = "hello";
        String reversed = reverse(input);

        System.out.println("Reverse String Result:");
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
        System.out.println();
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}