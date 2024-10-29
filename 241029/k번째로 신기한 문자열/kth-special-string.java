import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        String text = sc.next();


        System.out.println(equals(n, a, text));

    }

    public static Object equals(int n, int a, String text) {
        List arr = new ArrayList();

        for(int i = 0; i < n; i++){
            String word = sc.next();
            if(word.startsWith(text)){
                arr.add(word);
            }
        }

        Collections.sort(arr);
        return arr.get(a-1);
    }
}