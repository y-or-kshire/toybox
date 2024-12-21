package day3;

public class Circle{
    double r = 1.0;
    public double  circumference(){
        return 2 * Math.PI * r;
    }
    public double area(){
        return Math.PI * r * r;
    }
}