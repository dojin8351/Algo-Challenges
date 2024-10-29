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
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();
            results.add(new Result(name, kor, eng, mat));
        }
        Collections.sort(results);
        for(Result r : results){
            System.out.println(r);
        }
    }
}

class Result implements Comparable<Result>{

    String name;
    int kor, eng, mat, sum;


    Result(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        sum = kor + eng + mat;
    }
    @Override
    public String toString() {
        return String.format("%s %d %d %d", name, kor, eng, mat);
    }

    @Override
    public int compareTo(Result o) {
        return this.sum - o.sum;
    }

}