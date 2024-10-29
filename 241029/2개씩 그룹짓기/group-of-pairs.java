import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n*2];
        for (int i = 0; i < n*2; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        System.out.println(MaxValue(arr, arr.length/2));
    }

    public static int MaxValue(Integer[] arr, int n) {
        Arrays.sort(arr); // 오름차순 정렬
        int maxGroupSum = 0;

        for (int i = 0; i < n; i++) {
            int groupSum = arr[i] + arr[arr.length - 1 - i];
            maxGroupSum = Math.max(maxGroupSum, groupSum);
        }

        return maxGroupSum;
    }
}