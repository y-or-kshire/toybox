package day3;

import java.util.Scanner;

// N^2からNへの全射を構成する

class bij{
    int m=0, n=0;
    int summ(int m, int n){
        int k = 0;
        int S = 0;
        while(true){
            S += k;
            k++;
            if (k > m + n){
                break;
            }
        }

        return S + n;
    }
}

class Titech94{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {

            bij a = new bij();
            int N = sc.nextInt(); // 走査の範囲を決めます
            int M = sc.nextInt(); // この値に対してf(m,n)=Mなるmとnがとれます

            Outer:
            for (int m=0; m <= N ; m++){

                Inner:
                for (int n=0; n + m <= N; ++n){
                    System.out.print(a.summ(m,n)+", ");
                    if (a.summ(m,n)==M){
                        System.out.println("\n" + "f(m,n)=" + M + "のとき, (m, n)= " + "(" + m + "," + n + ")");
                        break Outer;
                    } else if (a.summ(m, n)>N){
                        break Inner;
                    }
                }
                System.out.println();
            }
        }
    }
} 