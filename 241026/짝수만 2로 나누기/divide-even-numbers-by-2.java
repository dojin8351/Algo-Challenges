import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            function(a);
        }

    }

    public static void function(int a) {
        if(a % 2 == 0){
            System.out.print(a/2 + " ");
        } else {
            System.out.print(a + " ");
        }
        
    }
}