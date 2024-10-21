public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.printf("%d\n%d",a,b);
    }
}