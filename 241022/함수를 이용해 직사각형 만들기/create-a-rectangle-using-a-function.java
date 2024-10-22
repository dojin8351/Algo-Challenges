import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        printSquare(n, m);

    }

    public static void printSquare(int n, int m) {

        for(int i = 0; i < n; i++){
          for(int j = 0; j < m; j++){
              System.out.print("1");
          }
          System.out.println();
        }

    }
}