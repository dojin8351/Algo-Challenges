import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        int[] month = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daw = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; 
        int r1 = 0, r2 = 0;
        for(int i = 1; i<m1; i++){
            r1 += month[i];
        }
        for(int i = 1; i<m2; i++){
            r2 += month[i];
        }
        r1 += d1;
        r2 += d2;
        int r3 = (r2-r1)%7+1;
        int r = (r2-r1)/7;
        if(r3>Arrays.asList(daw).indexOf(A)){
            r= r+1;
        }
        System.out.print(r);

        
    }
}