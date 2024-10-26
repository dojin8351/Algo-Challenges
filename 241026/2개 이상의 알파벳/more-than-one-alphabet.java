import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        System.out.println(function(A));


    }

    public static String function(String A) {
        String[] alpList = new String[A.length()];
        int cnt = 0;
        String result = "";

        for(int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            alpList[i] = String.valueOf(ch);
        }

        for(int i = 0; i < alpList.length; i++) {
            for(int j = 0; j < alpList.length; j++) {
                if(!alpList[i].equals(alpList[j])) {
                    cnt++;
                }
            }
        }

        if(cnt == 0) {
            result = "No";
        } else {
            result = "Yes";
        }

        return result;
    }
}