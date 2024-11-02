import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int day2 = 11;
        int hour2 = 11;
        int minute2 = 11;

        int result = (day-day2) * 24 * 60 + (hour-hour2) * 60 + (minute-minute2);
        if(result < 0) {
            result = -1;
        }

        System.out.println(result);
    }
}