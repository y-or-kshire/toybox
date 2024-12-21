package day2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int t = 0;
        for(long n = m; n > 1; t++) {
            if (n % 2 == 0) {
                    n /= 2;
                    System.out.println(n);
            } else {
                    n = n * 3 + 1;
                    System.out.println(n);
            };
    };
        System.out.println("\n" + t);
    }
}
