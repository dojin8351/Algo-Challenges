import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        int decimal =Integer.parseInt(number,2) * 17;
        System.out.println(Integer.toBinaryString(decimal));
        
    }

}