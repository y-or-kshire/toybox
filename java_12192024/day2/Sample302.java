package day2;

import java.util.Scanner;

public class Sample302{
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            Integer a = sc.nextInt();
            boolean p =  a instanceof Integer;

            if (p==true){
                System.out.println("a="+a + "has a property as below:");

                if ((a*a % 3 == 0) && (a*a % 4 == 0)){
                    System.out.println(6 + " | a");
                } else if ((a*a % 3 == 1) && (a*a % 4 == 0)) {
                    System.out.println(a%6 + " mod 6, even");
                } else  {
                    System.out.println(a%6 + " mod 6, odd");
                }
            } else {
                System.out.println("value?");
            }
        } 
    }
}