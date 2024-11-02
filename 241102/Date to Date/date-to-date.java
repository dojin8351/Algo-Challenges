import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int cnt = 1;
        int[] day_of_month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        while (true){
            if(m1 == m2 && d1 == d2){
                break;
            }
            cnt++;
            d1++;

            if(d1 > day_of_month[m1]){
                m1++;
                d1 = 1;
            }

        }

        System.out.println(cnt);
    }
}