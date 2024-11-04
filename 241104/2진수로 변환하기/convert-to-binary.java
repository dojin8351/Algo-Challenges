import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(true){
            if(num == 0 || num == 1){
                list.add(num);
                break;
            }

            list.add(num % 2);
            num /= 2;
        }

        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i));
        }

    }
}