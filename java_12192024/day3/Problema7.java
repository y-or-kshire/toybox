package day3;

class Data{
    private int number;
    private String comment;

    public void setNumber(int n){
        number = n;
    }
    public void setComment(String c){
        comment = c;
    }
    public int getNumber(){
        return number;
    }
    public String getComment(){
        return comment;
    }
}

class Problem701{
    public static void main(String[] args){
        Data d = new Data();
        d.setNumber(100);
        d.setComment("Programming Java");
        System.out.println(d.getNumber());
        System.out.println(d.getComment());
    }
}

class TwoStrings{
    private String string1;
    private String string2;
    public void setString1(String string1){
        this.string1 = string1;
    }
    public void setString2(String string2){
        this.string2 = string2;
    }
    public String getString1(){
        return string1;
    }
    public String getString2(){
        return string2;
    }
    public String getConnectedString(){
        return string1 + string2;
    }
}

class Problem702{
    public static void main(String[] args) {
        TwoStrings s = new TwoStrings();
        s.setString1("Hello");
        s.setString2("World");
        System.out.println(s.getString1());
        System.out.println(s.getString2());
        System.out.println(s.getConnectedString());
    }
}

class Calculation{
    private int n, m;
    public void setnumber1(int n){
        this.n = n;
    }
    public void setnumber2(int m){
        this.m = m;
    }
    public int getnumber1(){
        return n;
    }
    public int getnumber2(){
        return m;
    }

    public int add(){
        return n + m;
    }
    public int sub(){
        return n - m;
    }
}

class Problem703{
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.setnumber1(8);
        c.setnumber2(9);
        System.out.println(c.getnumber1()+ "+" + c.getnumber2() + "=" + c.add());
        System.out.println(c.getnumber1()+ "-" + c.getnumber2() + "=" + c.sub());
        
    }
}