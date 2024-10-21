import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a < 5){
            System.out.println("tiny");
            System.out.printf("%d",a*a);
        } else {
            System.out.printf("%d",a*a);
        }


    }
}