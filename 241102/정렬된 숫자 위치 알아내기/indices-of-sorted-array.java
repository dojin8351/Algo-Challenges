import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> originalResults  = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            originalResults .add(new Result(a, i));
        }
        List<Result> sortedResults = new ArrayList<>(originalResults);
        sortedResults.sort((o1, o2) -> {
            if(o1.value == o2.value){
                return o1.index - o2.index;
            }
            return o1.value - o2.value;
        });

        int[] positions = new int[n];

        for (int i = 0; i < n; i++) {
            positions[sortedResults.get(i).index - 1] = i + 1;
        }

        // 원본 리스트의 원소 순서에 맞춰 이동한 인덱스 출력
        for (int i = 0; i < n; i++) {
            System.out.print(positions[i] + " ");
        }



    }
}

class Result {

    int value;
    int index;


    Result(int value, int index) {
        this.value = value;
        this.index = index;
    }
}