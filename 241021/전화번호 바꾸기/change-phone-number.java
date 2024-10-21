import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("-");


        System.out.printf("010-%s-%s",a[2],a[1]);
    }
}