import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] diff = new int[201];

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            diff[a + 100]++;
            diff[b + 100]--;
        }

        int max = 0;
        int current = 0;

        for(int i = 0; i < 201; i++) {
            current += diff[i];
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}