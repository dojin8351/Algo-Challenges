import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i < function(a, b).length; i++){
            System.out.print(function(a, b)[i] + " ");
        }

    }

    public static int[] function(int a, int b) {
        int[] arr = new int[2];
        if(a > b) {
            arr[0] = a * 2;
            arr[1] = b + 10;
        }
        
        if(a < b) {
            arr[0] = a + 10;
            arr[1] = b * 2;
        }
        
        return arr;

    }

}