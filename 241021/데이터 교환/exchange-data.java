public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 0;
        int e = 0;
        d = b;
        b = a;
        e = c;
        c = d;
        a = e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}