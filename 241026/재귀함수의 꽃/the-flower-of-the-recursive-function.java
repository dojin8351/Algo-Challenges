import java.util.Scanner;

public class Main {
    public static void printStars(int n) {
        if(n == 0)
            return;

        System.out.print(n + " ");
        printStars(n-1);
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();

        printStars(n);


    }
}