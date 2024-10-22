import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        printSquare(n,m);

    }

    public static void printSquare(int n, int m) {

        int i = 0;
        while (true){
            i++;
            if(i % n == 0 && i % m == 0){
                System.out.println(i);
                break;
            }


        }

    }
}