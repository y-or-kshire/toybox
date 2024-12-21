package day2;

class Problem501{
    public static void main(String[] args){
        int[] a =new int[7];
        for (int t = 0; t < a.length ; t++){
        a[t] = (int)(Math.random()*10) + 1;
        System.out.print("a["+ t + "]=" + a[t] + " ");
        }
    }   
}

class Problem502{
    public static void main(String[] args){
        double a[] = {0.2, -5.1, 3.2, 1.8};
        
        for (int t = 0; t < a.length ; t++){
            System.out.print("a["+ t + "]=" + a[t] + " ");
        }
        
        System.out.println();
    }
}

class Problem503{
    public static void main(String[] args){
        int a[] = new int[10];

        int t = 0;
        for (t = 0; t < a.length; t++){
            a[t] = (int)(Math.random()*10)+1;
            System.out.print(a[t] + " ");
        }
        
        System.out.println();

        System.out.print("奇数：");
        for (t = 0; t < a.length; t++){
            if (a[t] % 2 == 1){
                System.out.print(a[t]);
            }
        }
        System.out.println();
 
        System.out.print("偶数：");
        for (t = 0; t < a.length; t++){
            if (a[t] % 2 == 0){
                System.out.print(a[t]);
            }
        }
        System.out.println();

    }
}

class Problem504{
    public static void main(String[] args){
        int a[] = new int[10];
        for (int t = 0; t < a.length; t++){
            a[t] = (int)(Math.random()*100)+1;
            System.out.print(a[t] + " ");
        }

        System.out.println();

        for (int t = 0; t < a.length; t++){
            if (a[t] % 2 == 0){
                System.out.print(a[t] + " ");
            }
        }
    }
}

class Problem506{
    public static void main(String[] args){
        int a[] = new int[10];
        for (int t = 0; t < a.length; t++){
            a[t] = (int)(Math.random()*10)+1;
            System.out.print(a[t] + " ");
        }

        System.out.println();

        int max = a[0];
        int min = a[0];
        for (int t = 0; t < a.length; t++){
            if (a[t] > max){
                max = a[t];
            } else if (a[t] < min){
                min = a[t];
            } else {
                continue;
            }
        }

        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);
    }
}

class Problem507{
    public static void main(String[] args){
        int a[] = new int[5];
        for (int t=0; t < a.length; t++){
            a[t] = (int)(Math.random()*21)-10;
            System.out.print(a[t] + " ");
        }
        System.out.println();

        int S = 0;
        for (int t=0; t < a.length; t++){
            if (a[t] > 0){
                S += a[t];
            }
        }
        System.out.println("合計値:" + S);
        System.out.println("平均値:" + S/a.length);

        int up = 0;
        int down = 0;
        System.out.print("平均値より小さい：");
        for (int t=0; t < a.length; t++){
            if (a[t] < S/a.length){
                System.out.print(a[t] + " ");
                up++;
            }
        }
        System.out.println("…" + up + "個");

        System.out.print("平均値より大きい：");
        for (int t=0; t < a.length; t++){
            if (a[t] > S/a.length){
                System.out.print(a[t] + " ");
                down++;
            }
        }
        System.out.println("…" + down + "個");

        System.out.println();
    }
}

class Problem510{
    public static void main(String[] args) {
        int a[] = new int[7];
        int t = 0;
        for (t = 0; t < a.length; t++){
            a[t] = (int)(Math.random()*10)+1;
            System.out.print(a[t] + " ");
        }

        System.out.println();

        for (t = 0; t < a.length; t++){
            int r = 0;
            do {
                System.out.print("＊");
                r++;
            } while (r < a[t]);
            System.out.println();
        }
    }
}

class Problem511{
    public static void main(String[] args){
        int a[] = new int[5];
        String txt1="", txt2="", txt3="";
        int t = 0;
        for (t = 0; t < a.length; t++){
            a[t] = (int)(Math.random()*100)+1;
            System.out.print(a[t] + " ");
            if (a[t] < 60){
                txt1 += a[t] + " ";
            } else if (a[t] >= 60 && a[t] < 80){
                txt2 += a[t] + " ";
            } else {
                txt3 += a[t] + " ";
            }
        }
        System.out.println();

        System.out.println("0以上60未満：" + txt1);
        System.out.println("60以上80未満：" + txt2);
        System.out.println("80以上：" + txt3);
    }
}

class Problem512{
    public static void main(String[] args){
        int a[][] = new int[3][3];
        for (int m = 0; m < a.length; m++){
            for (int n = 0; n < a[m].length; n++){
                a[m][n] = (int)(Math.random()*9)+1;
                System.out.print(a[m][n] + " ");
        }
        System.out.println();

        }
    }
}

class Problem513{
    public static void main(String[] args){

        int a[][] = new int[3][3];
        int max = a[0][0];
        int min = a[0][0];
        a[0][0] = 0;

        for (int m = 0; m < a.length; m++){
            for (int n = 0; n < a[m].length; n++){

                a[m][n] = (int)(Math.random()*10);
                System.out.print(a[m][n] + " ");
                
                if (max < a[m][n] || max == 0){
                    max = a[m][n];
                }
                if (min > a[m][n] || min == 0){
                    min = a[m][n];
                }
        }
        
        System.out.println();
                
        }
        
        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);

    }
}