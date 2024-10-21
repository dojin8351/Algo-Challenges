import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a + b;
        int minus = a - b;
        double result = (double)sum/minus;

        System.out.printf("%.2f",result);
    }
}