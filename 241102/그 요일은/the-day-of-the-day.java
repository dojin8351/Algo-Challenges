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
        int day_of_week_index = 0;
        for(int i = 0; i < day_of_weeks.length; i++){
            if(day_of_weeks[i].equals(day_of_week)){
                day_of_week_index = i;
            }
        }

        int diffValue = diff(m2,d2) - diff(m1,d1);

        int result = (diffValue - day_of_week_index) / day_of_weeks.length +1;


        System.out.println(result);
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