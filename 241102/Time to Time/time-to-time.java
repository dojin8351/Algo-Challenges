import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int result1 = c * 60 + d;
        int result2 = a * 60 + b;
        int result3 = result1 - result2;
        System.out.println(result3);
    }
}