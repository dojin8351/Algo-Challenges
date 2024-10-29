import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Result> results = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int score = sc.nextInt();
            results.add(new Result(name, score));
        }
        results.sort(Comparator.comparingInt(result -> result.score));
        System.out.println(results.get(0).toString());

    }
}

class Result {

    String name;
    int score;

    public Result(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}