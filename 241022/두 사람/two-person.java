import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int cnt = 0;

        for(int i = 0; i < 2; i ++) {
            int age = sc.nextInt();
            String gender = sc.next();

            if(age >= 19 && gender.equals("M")) {
                result = 1;
            } else {
                result = 0;
            }

            if(result == 1){
                cnt++;
            }

        }

        if(cnt >= 1){
            System.out.println(1);
        } else {
            System.out.println(0);
        }



    }
}