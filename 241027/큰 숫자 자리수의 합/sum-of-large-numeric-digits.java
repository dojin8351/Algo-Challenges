import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int function(int a) {
        int sum = 0;
        if(a/10 <= 1) return a%10;

        return function(a/10) + a%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mulitple = 1;

        for(int i = 0; i < 3; i++){
            int a = sc.nextInt();
            mulitple *= a;
        }


        System.out.println(function(mulitple));

    }
}