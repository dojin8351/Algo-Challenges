import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();
        char[] ch = number.toCharArray();

        System.out.println(Arrays.toString(ch));
        int binary = 0;
        for (int i = 0; i < ch.length; i++) {
            // '1' 또는 '0'을 숫자로 변환하여 사용
            binary += (ch[i] - '0') * Math.pow(2, ch.length - i - 1);
        }

        System.out.println(binary);
    }
}