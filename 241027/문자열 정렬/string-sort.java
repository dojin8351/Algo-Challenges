import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] ch = text.toCharArray();

        Arrays.sort(ch);
        System.out.print(new String(ch));

    }
}