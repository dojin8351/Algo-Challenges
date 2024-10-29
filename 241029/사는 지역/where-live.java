import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String city = sc.next();
            results.add(new Result(name, address, city));
        }

        results.sort(Comparator.comparing(result -> result.name));

        System.out.println(results.get(n-1));
    }
}

class Result {

    String name;
    String address;
    String city;

    Result(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name " + name + "\naddr " + address + "\ncity " + city + "\n";
    }
}