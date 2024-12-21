package day2;

public class Sample212{
    public static void main(String[] args){

        int m = 127;
        int t = 0;

        for (long n=m; n > 1; t++){

            if ( n % 2 == 0 ){
                System.out.print(t + ":" + n + " is even, n/2=");
                n /= 2;
                System.out.println(n);
            } else {
                System.out.print(t + ":" + n + " is odd, (3n+1)/2=");
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
        System.out.println("it's" + "\n" + t);

    }

}
