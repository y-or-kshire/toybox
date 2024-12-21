package day3;

class Problem601 {
    public static void main(String[] args){
        Minmax m = new Minmax();
        int a = 4, b = 2;
        System.out.println("max{a,b}=" + m.max(a,b));
        System.out.println("min{a,b}=" + m.min(a,b));
    }
}

class Problem602{
    public static void main(String[] args) {
        Calc c = new Calc();
        double a = 4.0, b = 2.0;
        System.out.println("a + b = " + c.add(a,b));
        System.out.println("a - b = " + c.sub(a,b));
        System.out.println("a * b =" + c.mul(a,b));
        System.out.println("a / b =" + c.div(a,b));
    }
}

class Problem603{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 4.0;
        System.out.println("半径" + c.r + "の円の面積は" + c.circumference());
        System.out.println("半径" + c.r + "の円の面積は" + c.area());
    }
}
