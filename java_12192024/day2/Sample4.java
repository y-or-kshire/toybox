package day2;

class Sample401{
    public static void main(String[] args){
        for (int i = 5; i <= 10 ; i++){
            System.out.print(i+"");
        }
        System.out.println();
    }
}

class Sample401v{
    public static void main(String[] args){
        for (int i = 1; i <= 5 ; i++){
            int j = i++;
            System.out.println(i + "" + j + "");
        }
        System.out.println();

        for (int i = 1; i <= 30 ; i+=3){
            System.out.println(i + ":" + i*(i+1) % 24 + "" + "");
        }
        System.out.println();

    }
}

class Sample402{
    public static void main(String[] args){
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j  <= 3; j++){
                int k = i + j;
                System.out.print(i + "+"+ j + "=" + k  +" ");
            }
            System.out.println();
        }
    }
}

class Sample403{
    public static void main(String[] args){
        int i = 0;
        while (i <= 5){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }
}


class Sample403v{
    public static void main(String[] args){
        int i = 0, S = 0;
        while(S <= 105){
            System.out.println("(" + i + ","  + i*(i+1)/2 + "," + S + ")" +" ");
            i++;
            S += i;
        }
        System.out.println();
    }
}

class Sample404{
    public static void main(String[] args){
        int i = 0;
        do{
            System.out.print(i+" ");
            i++;
        }while (i<=5);
        System.out.println();
    }
}

class Sample404v{
    public static void main(String[] args){
        int i = 0, S = 0;

        do{
            System.out.println("(" + i + ","  + i*(i+1)/2 + "," + S + ")" +" ");
            i++;
            S += i;
        } while (S<=105);
        System.out.println();

    }
}

class Sample405{
    public static void main(String[] args){
        int i, num;
        num = 1;
        System.out.print("while;");
        i  = 1;
        while (1 < num){
            System.out.print("*");
            i++;
        }
        System.out.println();

        System.out.print("do-while:");
        i  = 1;
        do{
            System.out.print("*");
            i++;
        } while (i<num);
        System.out.println();

    }
}

class Sample406{
    public static void main(String[] args){
        System.out.println("6を出せ");
        while(true){
            int dice = (int)(Math.random()*6)+1;
            System.out.println(dice);
            if(dice==6){
                break;
            }
        }
        System.out.println("終了");
    }
}