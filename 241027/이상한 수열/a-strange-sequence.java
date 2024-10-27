import java.util.Scanner;

public class Main {
    public static int function(int n) {
        // 한 자리 수일 때 그대로 반환하도록 수정
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        return function(n / 3) + function(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(function(n));
    }
}