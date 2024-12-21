package day3;

class SampleClass1101{
    private int value = 0;
    private static int num = 0; // 静的フィールド
    public SampleClass1101(int value){
        this.value = value;
        num++;
    }
    public SampleClass1101(){
        this(100);
    }
    public static int getNumberOfInstance(){
        return num;
    }
    public int getValue(){
        return this.value;
    }
}

class Sample1101{
    public static void main(String[] args){
        SampleClass1101 s1,s2;
        System.out.println("インスタンス数:" + SampleClass1101.getNumberOfInstance());

        s1 = new SampleClass1101(50);
        s2 = new SampleClass1101();

        System.out.println(s1.getValue()); // 50
        System.out.println(s2.getValue()); // デフォルト；100

        System.out.println("インスタンス数:" + SampleClass1101.getNumberOfInstance());
    }
}

class Sample1102{
    // ガーベージコレクタ
    public Sample1102(){
        System.out.println("コンストラクタ");
    }
    public void foo(){ // インスタンスメソッド
        System.out.println("インスタンスメソッド");
    }
    public static void bar(){ // クラスメソッド
        System.out.println("静的メソッド");
    }
    public static void main(String[] args){
        Sample1102 i = new Sample1102(); // 自身のメソッド呼び出しでもnewする必要がある
        i.foo();
        i.bar(); // インスタンスから呼び出し
        Sample1102.bar();
        // クラス名からの呼び出し
        bar(); // クラス名省略
        System.gc(); // ガーベージコレクタの促進（自力で起動？）
    }
}