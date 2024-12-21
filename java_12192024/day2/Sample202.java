package day2;

public class Sample202 {
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