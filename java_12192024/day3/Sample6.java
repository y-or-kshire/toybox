package day3;

class Sample601{
    public static void main(String[] args){
        SampleClass01 s = new SampleClass01(); 
        s.n = 100;
        s.s = "Hello";
        int ans = s.add(1,2);
        String str = s.add("World");
        System.out.println(ans);
        System.out.println(str);
        s.showNum();
    }
}

class Sample602{
    public static void main(String[] args){
        SampleClass01 s1, s2;
        s1 = new SampleClass01();
        s2 = new SampleClass01();

        // s1, s2 は別のインスタンス
        // s1, s2 は別のメモリ領域を確保
        // s1, s2 は別のフィールド変数を持つ
        s1.n = 100;
        s2.n = 200;
        s1.s = "ABC";
        s2.s = "DEF";

        System.out.println(s1.add("D"));
        System.out.println(s2.add("G"));

        ++s1.n;
        s1.showNum();
        s2.showNum();

    }
}
