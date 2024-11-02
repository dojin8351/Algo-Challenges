import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = Math.abs(a) + Math.abs(b);
            list.add(new Result(sum, i));
        }

        list.sort((o1, o2) -> {
            if(o1.sum == o2.sum) {
                return o1.index - o2.index;
            }
            return o1.sum - o2.sum;
        });

        for(Result r : list) {
            System.out.println(r.index);
        }


    }
}

class Result {

    int sum;
    int index;


    Result(int sum, int index) {
        this.sum = sum;
        this.index = index;
    }

    @Override
    public String toString() {
        return String.format("%d", index);
    }
}