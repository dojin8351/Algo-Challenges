import java.util.Scanner;

public class Main {

    public static int sum = 0;
    public static int function(int n) {
        if(n == 0){
            return sum;
        }

        sum += n;
        function(n-1);

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(function(n));

    }
}