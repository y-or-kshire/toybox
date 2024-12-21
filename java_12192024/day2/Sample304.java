package day2;

public class Sample304 {
    public static void main(String[] args){
        int dice = (int)(Math.random()*7)+1;
        System.out.println("サイコロの目"+dice);

        if(1 <= dice && dice <= 6){
            if(dice % 2 == 0){
                System.out.println("丁です");
            } else {
                System.out.println("半です");
            }
        } else {
            System.out.println("range??");
        }
    }
}