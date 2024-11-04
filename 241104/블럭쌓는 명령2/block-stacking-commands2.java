import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[K];
        Arrays.fill(arr, 0);

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a-1; j < b; j++){
                arr[j]++;
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);



    }

}