package day2;

import java.util.Scanner;

public class Sample305{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            switch(num){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println("range?");
            }
        }
    }
}