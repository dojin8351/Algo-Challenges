import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> originalResults  = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int index = i;
            originalResults.add(new Result(height, weight, index));
        }

        originalResults.sort((o1, o2) -> {
            if(o1.height == o2.height) {
                return o2.weight - o1.weight;
            }
            return o1.height - o2.height;
        });

        for(Result r : originalResults) {
            System.out.println(r);
        }
    }
}

class Result{

    int height;
    int weight;
    int index;


    Result(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", height, weight, index);
    }

}