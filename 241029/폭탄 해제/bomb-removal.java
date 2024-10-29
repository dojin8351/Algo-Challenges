import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String code = sc.next();
        char color = sc.next().charAt(0);
        int time = sc.nextInt();

        Result result = new Result(code, color, time);
        System.out.println(result);
    }
}

class Result {

    String code;
    char color;
    int time;

    Result(String code, char color, int time) {
        this.code = code;
        this.color = color;
        this.time = time;
    }

    @Override
    public String toString() {
        return "code : " + code + "\ncolor : " + color + "\nsecond : " + time;
    }
}