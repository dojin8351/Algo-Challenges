import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = a;
        for(int i = 0; i < n; i++){
            sum = n + sum;
            System.out.println(sum);
        }


    }
}