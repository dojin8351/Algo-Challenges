import java.util.Scanner;

//class IntWrapper {
//    int value;
//
//    public IntWrapper(int value) {
//        this.value = value;
//    }
//}

public class Main {
    private static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        function(n);

    }

    public static void function(int n) {


        for(int i = 0; i < n; i++){
            System.out.println("HelloWorld");
        }
    }

}