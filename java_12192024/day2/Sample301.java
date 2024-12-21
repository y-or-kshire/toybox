package day2;

import java.util.Scanner;

public class Sample301{
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            System.out.println("a="+a);
            if (a > 0){
                System.out.println("positive,");
            } else {
                System.out.println("negative.");
            }
        } 
    }
}