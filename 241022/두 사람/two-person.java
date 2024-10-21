import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String gender = sc.next();

        if(age >= 19 && gender.equals("M")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
}