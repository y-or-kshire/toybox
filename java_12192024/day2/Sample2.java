package day2;

class Sample201{
    public static void main(String[] args){
        System.out.print(5 + "+" + 2 + "=");
        System.out.println(5+2);
        System.out.print(5 + "-" + 2 + "=");
        System.out.println(5-2);
        System.out.print(5 + "*" + 2 + "=");
        System.out.println(5*2);
        System.out.print(5 + "÷" + 2 + "=");
        System.out.print(5/2);
        System.out.print("あまり");
        System.out.println(5%2);
    }
}

class Sample202 {
    public static void main(String[] args) {
        int a; // 初期化
        int b = 3; // 初期化と代入を同時に行う
        int add, sub;
        double avg;
        a = 6; // 代入
        add = a+ b;
        sub = a - b;
        avg = (a + b) / 2.0;
        System.out.println(a + "+" + b + "=" + add);
        System.out.println(a + "-" + b + "=" + sub);
        System.out.println("avg (" + a + "," + b + ") =" + avg);
    }
}

class Sample206 {
    
    public static void main(String[] args) {
        final int NUMBER = 100;
        final String STRING = "Hoge";
        System.out.println(NUMBER);
        System.out.println(STRING);
        //  finalがついた変数は値を変えられない
        //NUMBER = 100;
        //STRING = "fuga";

    }
}

class Sample211 {
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

