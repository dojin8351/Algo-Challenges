import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name = sc.next();
        int code = sc.nextInt();

        Result result = new Result();
        System.out.println(result);

        Result result2 = new Result(name, code);
        System.out.println(result2);
    }
}

class Result {

    String name;
    int code;

    Result(){
        name = "codetree";
        code = 50;
    }

    Result(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "product " + code + " is " + name;
    }
}