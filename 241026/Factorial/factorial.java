import java.util.Scanner;

public class Main {

    public static int function(int n) {

        if(n <= 1) return n;

        return n * function(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(function(n));

    }
}