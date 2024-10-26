import java.util.Scanner;

public class Main {

    public static int cnt = 0;
    public static int function(int n) {
        if(n == 1) return cnt;
        cnt++;
        if(n % 2 == 0){
            return function(n/2);
        } else {
            return function(n/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(function(n));

    }
}