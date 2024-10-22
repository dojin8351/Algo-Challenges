import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        printSquare(n,m);

    }

    public static void printSquare(int n, int m) {
        List measureN = new ArrayList();
        List measureM = new ArrayList();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                measureN.add(i);
            }
        }

        for(int i = 1; i <= m; i++){
            if(m % i == 0){
                measureM.add(i);
            }
        }

        measureN.retainAll(measureM);
        Collections.sort(measureN,Collections.reverseOrder());
        System.out.println(measureN.get(0));


    }
}