package day3;

public class Minmax {
    public int max(int n1, int n2){
        if (n1 > n2){
            return n1;
        } else {
            return n2;
        }
    }
    public int min(int n1, int n2){
        if (n1 < n2){
            return n1;
        } else {
            return n2;
        }
    }
}