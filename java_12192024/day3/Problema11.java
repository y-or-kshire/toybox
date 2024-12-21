package day3;

class Problem1101{
    public static void main(String[] args){
        int a = (int)(Math.random()*10)+1;
        int b = (int)(Math.random()*10)+1;
        int result1 = add(a,b);
        int result2 = sub(a,b);
        int result3 = pow(a,b);
        System.out.println("a="+ a+ ", b-"+ b);
        System.out.println(a+ "+" + b + "=" + result1);
        System.out.println(a+ "-" + b + "=" + result2);
        System.out.println(a+ "^" + b + "=" + result3);
    }
    static int add(int a, int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }

    static int pow(int a, int b){
        return (int)(Math.pow((double)(a), (double)(b)));
    }
}

class Problem1102{
    public static void main(String[] args) {
        int n[] = new int[3];
        int t = 0;
        while(t<3){
            n[t] = (int)(Math.random()*10)+1;
            System.out.print("n["+t+"]= "+n[t]);
            t++;
        }
        System.out.println();
        
        int result = mul(n[0], n[1], n[2]);
        System.out.println(n[0] + "*" + n[1] + "*" + n[2] + "=" + result);

    }

    static int mul(int a, int b, int c){
        return a * b * c;
    }
}

class Problem1103{
    
    public static void main(String[] args) {
        int n1 = (int)(Math.random()*10)+1;
        int n2 = (int)(Math.random()*10)+1;
        System.out.print("たて："+n1+"、よこ："+n2 + "\n");
        square(n1, n2);
    }

    static void square(int a, int b){
        int n=0, m=0;
        String sq = "";
        for(n=0;n<b;n++){

            for(m=0;m<a;m++){
                sq += "■";
            }
            
            sq += "\n";
        }
        System.out.println(sq);
    }
}

class Counter{
    private int count =0;
    public static int totalCount; // 

    public void reset(){
        count = 0;
    }
    public void count(){
        count++;
    }
    public int getCount(){
        return count;
    }

    static void getTotal(Counter c1, Counter c2){
        totalCount = c1.getCount() + c2.getCount();
        System.out.println(totalCount); 
    }
    
} 

class Problem1104{
  
    public static void main(String[] args){
        Counter c1, c2;
        c1 = new Counter();
        c2 = new Counter();

        int t = 0;
        while(true){
            double a = Math.random()*1;

            if(a>0.5){
                c1.count();
            } else {
                c2.count();
                if((int)(100*a)==42){
                    c2.reset();
                }
            }

            t++;

            if(t>=2000){
                break;
            }
        }

        System.out.println("c1のカウント数" + c1.getCount());
        System.out.println("c2のカウント数" + c2.getCount());
        Counter.getTotal(c1,c2);
    }

}
