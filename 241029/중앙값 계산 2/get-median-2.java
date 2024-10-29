import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Integer> midValue = new ArrayList<>();

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> values = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            values.add(sc.nextInt());
        }

        output(values);

        for(int i = 0; i < midValue.size(); i++) {
            System.out.print(midValue.get(i) + " ");
        }

    }

    public static void output(List<Integer> list) {
        List<Integer> valuesCopy = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            valuesCopy.add(list.get(i));
            if((i + 1) % 2 == 1){
                Collections.sort(valuesCopy);
                midValue.add(valuesCopy.get(valuesCopy.size()/2));
            }
        }
    }
}