import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] day_of_month = {0,31,30,31,30,31,30,31,31,30,31,30,31};
        String[] day_of_week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int term = d2 - d1;
        if(m2 - m1 > 0){
            for(int i = m1; i < m2; i++){
                term += day_of_month[i];
            }
        }else if(m2 - m1 < 0){
            for(int i = m2; i > m1; i--){
                term -= day_of_month[i];
            }
        }
        
        if(term > 0){
            int i = 1;
            while(term > 0){
                if(i++ == 6){
                    i = 0;
                }
                term--;
            }
            System.out.println(day_of_week[i]);
        }else if(term < 0) {
            int i = 1;
            while(term < 0){
                if(i-- == 0){
                    i = 6;
                }
                term++;
            }
            System.out.println(day_of_week[i]);
        } else {
            System.out.println(day_of_week[1]);
        }
    }
}