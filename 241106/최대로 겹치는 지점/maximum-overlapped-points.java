import java.util.Scanner;

public class Main {
    public static final int MAX_POSITION = 101;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] diff = new int[MAX_POSITION + 1];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            diff[x1]++;
            if (x2 + 1 <= 100) {
                diff[x2 + 1]--;
            }
        }

        int current = 0;
        int maxOverlap = 0;

        for (int i = 0; i <= 100; i++) {
            current += diff[i];
            maxOverlap = Math.max(maxOverlap, current);
        }

        
        System.out.println(maxOverlap);
    }
}