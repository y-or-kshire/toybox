package day2;

public class Problem301 {
    public static void main(String[] args){
        int t = 0;
        for(t = 0; t < 10; t++) {
            int num = (int)(Math.random()*10)+1;
            System.out.print(num + "。");
                if(num >= 5){
                    System.out.print("5以上です");
                    if(!(num % 2 == 0)){
                        System.out.println("が、奇数です");
                    } else {
                        System.out.println("。偶数です。");
                    }
                } else {
                    System.out.print("\n");
                    continue;
                }
        }
    }
}