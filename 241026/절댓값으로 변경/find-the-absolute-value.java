import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            int b = sc.nextInt();
            System.out.print(function(b) + " ");
        }


    }

    public static int function(int b) {

        int abs = Math.abs(b);

        return abs;

    }

}