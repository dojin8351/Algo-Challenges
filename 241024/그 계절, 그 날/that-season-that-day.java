import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Y = in.nextInt();
        int M = in.nextInt();
        int D = in.nextInt();
        System.out.println(checkDay(Y, M, D));



    }

    public static String checkDay(int Y, int M, int D) {

        if(M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12){
            if(D > 31){
                return "-1";
            } else {
                if(M == 3 || M == 5){
                    return "Spring";
                } else if(M == 8) {
                    return "Summer";
                } else if(M == 10){
                    return "Fall";
                } else {
                    return "Winter";
                }
            }
        } else if(M == 2){
            if(D == 29){
                if(Y % 4 == 0){
                    if(Y % 100 == 0){
                        if(Y % 400 == 0){
                            return "Winter";
                        } else{
                            return "-1";
                        }
                    }else {
                        return "Winter";
                    }
                }else {
                    return "-1";
                }
            } else if(D <= 28) {
                return "Winter";
            } else {
                return "-1";
            }
        } else {
            if(D > 30){
                return "-1";
            } else {
                if(M == 4){
                    return "Spring";
                } else if(M == 6) {
                    return "Summer";
                } else if(M == 9 || M == 11) {
                    return "Fall";
                }
            }
        }

        return null;
    }


}