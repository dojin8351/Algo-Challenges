import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String id = sc.next();
        int level = sc.nextInt();

        Result result = new Result();
        System.out.println(result);

        Result result2 = new Result(id, level);
        System.out.println(result2);
    }
}

class Result {

    String id;
    int level;

    public Result() {
        this.id = "codetree";
        this.level = 10;
    }

    public Result(String id, int level) {
        this.id = id;
        this.level = level;
    }
    
    @Override
    public String toString() {
        return "user " + id + " lv " + level;
    }
}