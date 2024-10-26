import java.util.Scanner;

public class Main {

    public static int[] arr = null;

    public static int sum(int a, int b) {
        int sum = 0;
        for(int i = a-1; i <= b-1; i++) {
            sum += arr[i];
        }

        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum(a, b));
        }
    }
}