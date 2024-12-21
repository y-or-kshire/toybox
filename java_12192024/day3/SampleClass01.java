package day3;

public class SampleClass01 {
    //  フィールド
    int n = 10;
    String s = "field";
    //  メソッド
    /*
        コンストラクタが無い場合、デフォルトコンストラクタが自動的に生成される
        処理としては、何もしない
    */
    int add(int a,int b){
        return a + b;
    }
    String add(String s){
        return this.s + s;
    }
    void showNum(){
        System.out.println("n = " + n);
    }
}