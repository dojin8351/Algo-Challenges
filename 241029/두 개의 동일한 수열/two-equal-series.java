import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }
}