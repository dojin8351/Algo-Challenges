import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        printSquare(n);

    }

    public static void printSquare(int n) {
        int a = 0;
        for(int i = 1; i <= n*n; i++) {

            if(a >= 9){
                a = a -9;
                System.out.print((a+=1) + " ");

            }else {
                System.out.print((a+=1) + " ");

            }

            if(i % n == 0){
                System.out.println();
            }

        }

    }
}