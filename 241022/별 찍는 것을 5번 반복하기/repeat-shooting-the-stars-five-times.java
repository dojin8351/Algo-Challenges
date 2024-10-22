import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        String printStars = "";
        
        for(int i = 0; i < 5; i++) {
            printStars += print5Stars();
        }
        
        System.out.println(printStars);

        



    }

    public static String print5Stars(){
        String stars = "";
        for(int i = 0; i < 10; i++){
            stars += "*";
        }
        stars += "\n";
        return stars;
    }
}