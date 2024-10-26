import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < function(a, b).length; i++) {
            System.out.print(function(a, b)[i] + " ");
        }

    }

    public static int[] function(int a, int b) {
        int[] result = new int[2];
        result[0] = a;
        result[1] = b;

        int max = Math.max(a, b);
        if(max == a) {
            result[0] = max + 25;
        } else if(max == b) {
            result[1] = max + 25;
        }
        int min = Math.min(a, b);
        if(min == a) {
            result[0] = min * 2;
        } else if(min == b) {
            result[1] = min * 2;
        }

        return result;

    }

}