import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> results = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            results.add(new Result(height, weight, i+1));
        }
        Collections.sort(results);
        for(Result r : results){
            System.out.println(r);
        }
    }
}

class Result implements Comparable<Result>{

    int height, weight, num;


    Result(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", height, weight, num);
    }

    @Override
    public int compareTo(Result o) {
        if(o.height != this.height){
            return o.height - this.height;
        } else if(o.weight != this.weight){
            return o.weight - this.weight;
        } else {
            return this.num - o.num;
        }
    }

}