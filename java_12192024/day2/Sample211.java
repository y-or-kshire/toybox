package day2;

public class Sample211 {
    public static void main(String[] args) {
        final int p=57, q=32;
        int a=p, b=q;
        
        int x1;
        x1 = a/b;
        a %= b;
        System.out.println(p + "=" + x1 + "*" + b + "+" + a);
        
        int x2, b1 = b;
        x2 = b/a;
        b %= a;
        System.out.println(b1 + "=" + x2 + "*" + a + "+" + b);

        int x3, b2 = a;
        x3 = a/b;
        a %= b;
        System.out.println(b2 + "=" + x3 + "*" + b + "+" + a);

        int x4, b3 = b;
        x4 = b/a;
        b %= a;
        System.out.println(b3 + "=" + x4 + "*" + a + "+" + b);

        int x5, b4 = a;
        x5 = a/b;
        a %= b;
        System.out.println(b4 + "=" + x5 + "*" + b + "+" + a);


    }
}