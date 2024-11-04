import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        int decimal = decimalSystem(number) * 17;
        binarySystem(decimal,2);


    }

    public static void binarySystem(int number, Integer binaryNum){

        List<Integer> elm = new ArrayList<>();

        while(true){
            if(number == 0 || number < binaryNum){
                elm.add(number);
                break;
            }

            elm.add(number % binaryNum);
            number /= binaryNum;
        }

        for(int i = elm.size() - 1; i >= 0; i--){
            System.out.print(elm.get(i));
        }
    }


    public static int decimalSystem(String number){
        List<Integer> elm = new ArrayList<>();

        char[] ch = number.toCharArray();
        int decimal = 0;
        for(int i = 0; i < ch.length; i++){
            decimal += ((int) ((ch[i] -'0') * Math.pow(2,ch.length - i-1)));
        }
        return decimal;
    }
}