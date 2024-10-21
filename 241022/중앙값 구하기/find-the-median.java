import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> num = new ArrayList<>();
        num.add(a);
        num.add(b);
        num.add(c);

        Collections.sort(num);
        
        System.out.println(num.get(1));


    }
}