import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        print5Stars(n);

    }

    public static void print5Stars(int num){

        for(int i = 0; i < num; i++){
           System.out.println("12345^&*()_");
        }

    }
}