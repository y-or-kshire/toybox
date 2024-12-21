package day2;

class Problem401{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        System.out.println(dice);
        for (int i=1; i<=dice; i++){
            System.out.print("■");
        }

        System.out.println("");
    }
}

class Problem402{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        System.out.println(dice);

        int t = 1;
        while (t <= dice){
            System.out.print("■");
            t++;
        }

        System.out.println("");
    }

}

class Problem403{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        System.out.println(dice);

        int t = 1;
        do{
            System.out.print("■");
            t++;
        } while (t<=dice);
        System.out.println();
    }
}

class Problem404v{
    public static void main(String[] args){
        int a = 0;

        do{
            System.out.println("a="+a);
            a++;
        } while (a<=3);
    }
}
class Problem404{
    public static void main(String[] args){
        int a = 0;

        while (a<=3) {
            System.out.println("a="+a);
            a++;
        }
    }
}

class Problem405{
    public static void main(String[] args){
        int a = 0;
        for (a=0; a<=3; a++){
            System.out.println("a="+a);
        }
    }
}

class Problem405v{
    public static void main(String[] args){
        int a = 0;
        while(true){
            System.out.println("a="+a);
            a++;
            if (a==4){
                break;
            }
        }
    }
}

class Problem406{
    public static void main(String[] args){
        int a = 3;
        while(a>=0){
            System.out.println("a="+a);
            a--;
        }
    }
}

class Problem407{
    public static void main(String[] args){
        for(int a = 3 ; a >= 0; a--){
            System.out.println("a="+a);
        }
    }
}

class Problem408{
    public static void main(String[] args){

        while (true){
            int i = (int)(Math.random()*10+1);
            System.out.println(i);
            if (i==10){
                break;
            }
        }
    }
}

class Problem409{
    public static void main(String[] args){
        while (true){
            int i = (int)(Math.random()*100)+1;
            System.out.println(i);
            if (i % 10 ==0){
                System.out.println("終了ステータスが表示されています");
                break;
            }
        }
    }
}

class Problem410{
    public static void main(String[] args){
        int i;
        for (int t=0; t<=5; t++){
        i = (int)(Math.random()*100)+1;
        System.out.println(i);
        }
    }
}

class Problem411{
    public static void main(String[] args){
        int m = 5;
        int[] i = new int[m];
        int intmax = 0;
        for (int t=0; t<m; t++){
            i[t] =  (int)(Math.random()*100)+1;
            System.out.println(i[t]);
            if(intmax < i[t]){
                intmax = i[t];
            }
        }
        System.out.println("最大値：" + intmax);
    }
}

class Problem412{
    public static void main(String[] args){
        int m = 5;
        int[] i = new int[m];
        int intmin = 100;
        for (int t=0; t<m; t++){
            i[t] =  (int)(Math.random()*100)+1;
            System.out.println(i[t]);
            if(intmin > i[t]){
                intmin = i[t];
            }
        }
        System.out.println("最小値：" + intmin);
    }
}

class Problem413{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        if (dice >= 5){
            for (int t = 0; t < dice; t++){
                System.out.print("★");
            }
            System.out.print(" " + dice + "\n");
        } else {
            System.out.println("値：" + dice);
        }
    }
}

class Problem414{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        if (dice % 2 == 0){
            for (int t = 0; t < dice; t++){
                System.out.print("★");
            }
            System.out.print(" " + dice + "\n");
        } else {
            for (int t = 0; t < dice; t++){
                System.out.print("☆");
            }
            System.out.print(" " + dice + "\n");
        }
    }
}

class Problem415{
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if (i < 10){
                System.out.print("0");
            }

            System.out.print(i + ", ");
            if (i %10 == 0){
                System.out.println();
            }
        }
    }
}

class Problem416{
    public static void main(String[] args){
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(i + "`" + j + "=" + i*j);
                if (j == 9){
                    System.out.println();
                }
            }
        }
        
    }
}

class Problem417{
    public static void main(String[] args){
        for (int i = 1; i <=10; i++){
            int j = 1;
            while(j<=10){
                if (j<=i){
                    System.out.print("■");
                } else {
                    System.out.print("□");
                    if (j==10){
                        System.out.println();
                    }
                }
                j++;
            }
        }
    }
}


class Problem417v{
    public static void main(String[] args){
        for (int i = 1; i <=10; i++){
            int j = 1;
            for (j = 1; j<=10; j++){
                if (j<=i){
                    System.out.print("■");
                } else {
                    System.out.print("□");
                    if (j==10){
                        System.out.println();
                    }
                }
            }
        }
    }
}

class Problem418{
    public static void main(String[] args){
        for (int i = 1; i <=10; i++){
            int j = 1;
            for (j = 1; j<=10; j++){
                if (!(j==i)){
                    System.out.print("■");
                } else {
                    System.out.print("□");
                    }
                if (j==10){
                    System.out.println();
                }
            }
        }
    }
}

