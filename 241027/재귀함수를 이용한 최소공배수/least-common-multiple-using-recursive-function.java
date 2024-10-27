import java.util.Scanner;

public class Main {
    // 두 수의 최대공약수(GCD)를 구하는 재귀 함수
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 두 수의 최소공배수(LCM)를 구하는 함수
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // n개의 수의 최소공배수를 구하는 재귀 함수
    public static int lcmOfArray(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index]; // 배열의 마지막 원소인 경우 그 값을 반환
        return lcm(arr[index], lcmOfArray(arr, index + 1)); // 두 수의 lcm을 재귀적으로 계산
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = lcmOfArray(arr, 0);
        System.out.println("The Least Common Multiple is: " + result);
    }
}