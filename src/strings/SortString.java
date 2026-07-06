package strings;

import java.util.Arrays;
public class SortString {
    public static void run() {
        String str = "fadfasdfgvgaergaedfasdgrtuyywdcdfjhuykjndfva";
        sortString(str);
    }

    private static void sortString(String str) {
        char[] ch = str.toCharArray();      
        Arrays.sort(ch);
        System.out.println(ch);
    }
}