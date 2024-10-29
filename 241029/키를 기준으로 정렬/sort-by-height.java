import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> results = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            results.add(new Result(name, height, weight));
        }

        results.sort(Comparator.comparingInt(result->result.height));
        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i));
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
        // Date 형식을 지정하여 출력
        return String.format("%s %d %d", name, height, weight);
    }
}