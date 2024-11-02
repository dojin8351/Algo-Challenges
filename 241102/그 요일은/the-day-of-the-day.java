import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int[] day_of_month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static String[] day_of_weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) {

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day_of_week = sc.next();

        int day_of_week_index = Arrays.asList(day_of_weeks).indexOf(day_of_week);

        int totalDays = diff(m2, d2) - diff(m1, d1);

        int count = 0;
        int currentDay = day_of_week_index;

        for (int date = 0; date <= totalDays; date++) {
            if (currentDay == day_of_week_index) {
                count++;
            }
            currentDay = (currentDay + 1) % 7;
        }


        System.out.println(count);
    }

    public static int diff(int m, int d) {
        int diff = 0;
        if(m > 1) {
            for(int i = 1; i < m; i++){
                diff += day_of_month[i];
            }
        }
        return diff + d;
    }
}