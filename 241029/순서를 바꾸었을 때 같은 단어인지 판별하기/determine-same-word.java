import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(equals(a, b));
    }

    public static String equals(String a, String b) {

        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();

        Arrays.sort(chA);
        Arrays.sort(chB);

        if(Arrays.equals(chA, chB)) {
            return "Yes";
        } else {
            return "No";
        }

    }
}