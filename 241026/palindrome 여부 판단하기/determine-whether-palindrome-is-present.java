import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        function(n);

    }

    public static void function(String a) {

        String[] arr = new String[a.length()];
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            arr[i] = String.valueOf(a.charAt(i));
        }

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i].equals(arr[arr.length-i-1])){
                cnt++;
            }
        }

        if(cnt == arr.length){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}