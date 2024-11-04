import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int binary = sc.nextInt();

        List<Integer> elm = new ArrayList<>();

        while(true){
            if(number == 0 || number < binary){
                elm.add(number);
                break;
            }

            elm.add(number % binary);
            number /= binary;
        }

        for(int i = elm.size() - 1; i >= 0; i--){
            System.out.print(elm.get(i));
        }


    }
}