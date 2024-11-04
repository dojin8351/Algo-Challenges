import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a-1; j < b; j++){
                arr[j]++;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);



    }

}