package day3;

class SampleClass02{
    public SampleClass02(){
        System.out.println("SampleClass02のコンストラクタ");
    }
    private void method(){ // private method; 同じクラス内でのみ呼び出し
        System.out.println("method(private)");
    }
    public void method2(){ // public method: どこからでも呼び出し可能
        System.out.println("method2(public)");
    }
    public void method3(){
        method();
        System.out.println("method3(public) : num =" + this.num); 
            // this.num はフィールド変数numを指す; sampleClass02.num と同じ
    }

    private int num = 1;
}

class Sample701{
    public static void main(String[] args) {
        SampleClass02 s = new SampleClass02();
            // コンストラクタ呼び出し; 一度だけ呼び出される
        s.method2();
        s.method3();
    }
}

class SampleClass03{
    private int number = 0;
    private String str = "";
        // 初期値は隠蔽される
    public SampleClass03(String str){
        this.str = str;
    }
    public void setNumber(int number){
        this.number = number;
    }
        //  Setterメソッド; フィールド変数に値を設定
    public int getNumber(){
        return this.number;
    }
    public String getSrt(){
        return this.str;
    }
        // Getterメソッド; フィールド変数の値を取得
}

class Sample702{ 
    public static void main(String[] args) {
        SampleClass03 s = new SampleClass03("Hello");
        s.setNumber(100);
        System.out.println(s.getNumber());
        System.out.println(s.getSrt());       
    }
}


