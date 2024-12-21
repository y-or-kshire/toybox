package day2;

class Sample501{
    public static void main(String[] args){

        double one, two, three;
        double sum, avg;
        one = 1.2;
        two = 3.7;
        three = 4.1;
        System.out.println(one + "" + two + "" + three);
        
        sum = one + two + three;
        avg = sum / 3 ;
        System.out.println("sum:" + sum);
        System.out.println("avg:" + avg);
    }
}

class Sample502{
    public static void main(String[] args){

        double[] d = new double[3];
        double sum, avg;

        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        sum = 0.0;
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i] + " ");
            sum += d[i];
        }
        System.out.println();
        avg = sum / d.length;
        System.out.println("sum:" + sum);
        System.out.println("avg:" + avg);

    }
} 

class Sample503{
    public static void main(String[] args){
        
        int n[] = { 5,4,3,2,1 };
        String s[] = {"ABC", "DEF", "GHI"};
        int i;
        for (i = 0; i < n.length; i++){
            System.out.print(n[i]+ " ");
        }
        System.out.println();
        for (i = 0; i < s.length; i++){
            System.out.print(s[i]+ "");
        }

        System.out.println();

    }
}

class Sample504{
    public static void main(String[] args){
        int a[][] = new int[3][4];
        int m,n;
        for (m = 0; m < a.length; m++){
            for (n = 0; n < a[m].length; n++){
                a[m][n] = m+n;
            }
        }
        
        for(m = 0; m < a.length; m++){
            for(n = 0; n < a[m].length; n++){
                System.out.print(a[m][n]+" ");
            }
            System.out.println();
        }
    }
}


class Sample505{
    public static void main(String[] args){
        int a[][] = { {0, 1}, {2}, {3, 4, 5, 6}};
        for(int m=0; m < a.length; m++){
            for(int n = 0; n < a[m].length; n++){
                System.out.print(a[m][n]+"");
            }
            System.out.println();
        }
    }
}