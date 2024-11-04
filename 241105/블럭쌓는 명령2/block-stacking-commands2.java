import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열 크기
        int K = sc.nextInt(); // 업데이트 수

        // 차이 배열을 선언 및 초기화
        int[] diff = new int[N + 1];

        // 구간 업데이트
        for(int i = 0; i < K; i++) {
            int a = sc.nextInt(); // 시작 인덱스
            int b = sc.nextInt(); // 끝 인덱스

            diff[a - 1]++; // 시작 인덱스
            if (b <= N) {
                diff[b]--; // 끝 인덱스 다음 위치
            }
        }
        
        // 누적합을 통해 원래 배열을 복원하고 최댓값 찾기
        int max = 0;
        int current = 0;

        for(int i = 0; i < N; i++) {
            current += diff[i]; // 누적합 계산
            max = Math.max(max, current); // 최댓값 갱신
        }

        System.out.println(max); // 최댓값 출력
    }
}