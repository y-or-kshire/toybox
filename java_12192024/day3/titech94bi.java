package day3;

public class titech94bi{
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