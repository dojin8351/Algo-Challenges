import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Integer> midValue = new ArrayList<>();

    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        int c = sc.nextInt();

        Result result = new Result(a, b, c);
        System.out.println(result);
    }


}

class Result {

    String secret_code;
    String meeting_point;
    int time;

    public Result(String secret_code, String meeting_point, int time) {
        this.secret_code = secret_code;
        this.meeting_point = meeting_point;
        this.time = time;
    }

    @Override
    public String toString() {
        return "secret code : " + secret_code + "\nmeeting point : " + meeting_point + "\ntime : " + time;
    }
}