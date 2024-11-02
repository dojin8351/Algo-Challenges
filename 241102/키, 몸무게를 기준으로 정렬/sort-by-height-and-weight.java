import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            results.add(new Result(name, height, weight));
        }

        results.sort((o1, o2) -> {
            if (o1.height == o2.height) {
                return o2.weight - o1.weight;
            }
            return o1.height - o2.height;
        });

        for(Result result : results){
            System.out.println(result);
        }

    }
}

class Result {

    String name;
    int height;
    int weight;


    Result(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, height, weight);
    }
}