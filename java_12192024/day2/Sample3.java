package day2;

import java.util.Scanner;

class Sample301{
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

class Sample302{
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

class Sample304 {
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

class Sample305{
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