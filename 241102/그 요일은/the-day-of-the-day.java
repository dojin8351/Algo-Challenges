import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // 각 월의 일수 (2024년은 윤년이므로 2월은 29일)
    public static int[] day_of_month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // 요일 배열
    public static String[] day_of_weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        // 입력받을 날짜와 요일
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();
        
        // 기준 요일의 인덱스 찾기
        int targetDayIndex = Arrays.asList(day_of_weeks).indexOf(targetDay);

        // 두 날짜 간의 일수 차이 계산
        int totalDays = diff(m2, d2) - diff(m1, d1);
        
        // 특정 요일이 몇 번 등장하는지 계산
        int count = 0;
        for (int i = 0; i <= totalDays; i++) {  // totalDays 포함
            int currentDayIndex = (targetDayIndex + i) % 7; // 현재 요일 인덱스 계산
            if (currentDayIndex == targetDayIndex) {
                count++; // 기준 요일과 같은 경우 카운트
            }
        }

        // 결과 출력
        System.out.println(count);
    }

    // 주어진 월과 일을 기준으로 그날까지의 총 일수를 계산
    public static int diff(int m, int d) {
        int diff = 0;
        // 주어진 월 이전의 모든 일수를 더함
        for (int i = 1; i < m; i++) {
            diff += day_of_month[i];
        }
        return diff + d; // 해당 월의 일수도 더함
    }
}